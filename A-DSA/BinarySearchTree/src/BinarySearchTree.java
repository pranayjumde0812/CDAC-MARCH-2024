import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        //check if root is null i.e. the tree is empty
        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true) {

            if(data == temp.getData()) {
                return false;
            }

            if (data < temp.getData()) {
                //insert to left
                //check if temp has a left child or not
                if (temp.getLeft() == null) {
                    //temp does not have a left child, so newnode will become left child of temp node
                    temp.setLeft(newNode);
                    return true;
                }

                //if temp has a left child, then shift temp to it's left and continue
                temp = temp.getLeft();
            } else {
                //insert to right
                //check if temp has a right child
                if (temp.getRight() == null) {
                    //temp does not have a right child, so newnode becomes the right child of temp node
                    temp.setRight(newNode);
                    return true;
                }
                //temp has a right child, so shift to the right of temp and continue
                temp = temp.getRight();
            }
        }


    }

    public void preOrder() {

        System.out.println("Preorder: ");

        Node temp = root;
        Stack<Node> stack = new Stack<>();

        while(temp != null || !stack.empty()) {
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop().getRight();
        }
        System.out.println();
    }

    public void inOrder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.println("Inorder: ");

        while(temp != null || !stack.empty()) {
            while(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }
        System.out.println();
    }

    public void postOrder() {

        System.out.println("Postorder: ");
        class Pair {
            Node node;
            char flag;

            public Pair(Node node, char flag) {
                this.node = node;
                this.flag = flag;
            }
        }
        Stack<Pair> stack = new Stack<>();
        Node temp = root;

        while(temp != null || !stack.empty()) {

            while(temp != null) {
                stack.push( new Pair(temp, 'L'));
                temp = temp.getLeft();
            }

            Pair pair = stack.pop();
            if(pair.flag == 'L') {
                temp = pair.node.getRight();
                pair.flag = 'R';
                stack.push(pair);
            }
            else {
                System.out.print(pair.node.getData() + " ");
            }
        }
        System.out.println();
    }

    public void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public int getCount(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + getCount(root.getLeft()) + getCount(root.getRight());
    }

    public int getMax() {
        if(root == null) {
            return 0;
        }
        Node temp = root;
        while(temp.getRight() != null) {
            temp = temp.getRight();
        }

        return temp.getData();
    }

    public boolean search(int key) {
        if(root == null) {
            return false;
        }
        Node temp = root;

        while(temp != null) {
            if(temp.getData() == key) {
                return true;
            }
            if(key < temp.getData()) {
                temp = temp.getLeft();
            }
            else {
                temp = temp.getRight();
            }
        }

        return false;
    }

    public boolean delete(int data) {
        if(root == null) {
            return false;
        }

        //locate del along with parent
        Node parent = root;
        Node del = root;
        while(del.getData() != data) {
            parent = del;
            if(data < del.getData()) {
                del = del.getLeft();
            }
            else {
                del = del.getRight();
            }
            //check if del is null, if del is null means the data is not existing
            if(del == null) {
                return false;
            }
        }

        while(true) {
            //check if del is terminal node
            if (del.getLeft() == null && del.getRight() == null) {
                //del could be root and terminal both
                if (root == del) {
                    root = null;
                    return true;
                }

                //check if del is left child or right child and set the appropriate link of the parent to null
                if (parent.getLeft() == del) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                return true;
            }
            //del is non-terminal node, shift del down the tree
            if (del.getLeft() != null) {
                //find max from left subtree
                Node max = del.getLeft();
                //parent must be following max, as max is the node which will be physically deleted
                parent = del;
                while(max.getRight() != null) {
                    parent = max;
                    max = max.getRight();
                }
                //swap del and max data
                int temp = del.getData();
                del.setData(max.getData());
                max.setData(temp);

                //shift del to max, as max is containing the data to be deleted
                del = max;
            }
            else {
                //find min from right subtree
                Node min = del.getRight();
                parent = del;

                while(min.getLeft() != null) {
                    parent = min;
                    min = min.getLeft();
                }

                //swap
                int temp = del.getData();
                del.setData(min.getData());
                min.setData(temp);

                del = min;
            }
        }
    }
}
