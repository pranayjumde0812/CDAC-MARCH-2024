package com.app.sll;

public class LinkedList {

	private Node head;
	private static int cnt;

	public Node getHead() {
		return head;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		LinkedList.cnt = cnt;
	}

	public LinkedList() {
		head = null;
		cnt++;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
//        if(head.getData() == data) {
//            return false;
//        }
		while (temp.getNext() != null) {
			temp = temp.getNext();
//            if(temp.getData() == data) {
//                return false;
//            }
		}
		cnt++;
		temp.setNext(newNode);

		return true;
	}

	public boolean insert(int data, int position) {
		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			cnt++;
			return true;
		}

		// locate prev node
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		cnt++;

		return true;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// Q.3 display reverse
	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head;
		Node n2 = head.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}

		head.setNext(null);
		head = n1;
	}

	// Q.7 reverse by recursion
	public void displayReverse(Node temp) {
		if (temp == null) {
			System.out.println();
			return;
		}
		displayReverse(temp.getNext());
		System.out.print(temp.getData() + " ");

	}

	// Q12.sorting of list in linkedlist
	public void sortList() {

		Node current = head;
		while (current != null) {
			Node index = current.getNext();
			Node min = current;

			while (index != null) {
				if (index.getData() < min.getData()) {
					min = index;
				}
				index = index.getNext();
			}

			int temp = current.getData();
			current.setData(min.getData());
			min.setData(temp);

			current = current.getNext();
		}

	}

	// Q.8 find nth element from last
	public void nthElementFromLast(int N) {
		Node temp = head;

		if (cnt < N)
			return;

		for (int i = 1; i < cnt - N + 1; i++) {
			temp = temp.getNext();

		}
		System.out.println(temp.getData());

	}

	// Find nth element from first
	public void nthElementFromstart(int N) {
		Node temp = head;

		if (cnt < N)
			return;

		for (int i = 1; i < N; i++) {
			temp = temp.getNext();

		}
		System.out.println(temp.getData());

	}

	// Q.9 Remove last nth element from ll
	public boolean deleteByPosition(int position) {
		if (head == null || position <= 0) {
			return false;
		}

		if (position == 1) {
			head = head.getNext();
			return true;
		}

		Node prev = head;
		for (int i = 1; i < cnt - position; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		}

		cnt--;
		Node del = prev.getNext();
		prev.setNext(del.getNext());

		return true;
	}

	// Q.11 add an element at the middle of the linked list
	public boolean insertAtMiddle(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		// locate prev node
		Node prev = head;
		int value = cnt / 2;
		for (int i = 1; i < value; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		cnt++;

		return true;
	}

	// Q.ADV 2.remove all elements from a linked list of integers
	// which matches with given value

	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		cnt--;
		prev.setNext(del.getNext());
		return true;
	}

	// Q.4 Removed duplicate nodes in an unsorted linked list
	public boolean removeDup() {
		Node temp = head;
		while (temp != null) {
			Node del = temp;
			while (del.getNext() != null) {
				if (del.getNext().getData() == temp.getData()) {
					del.setNext(del.getNext().getNext());
				} else {
					del = del.getNext();
				}
			}
			temp = temp.getNext();
		}
		return true;
	}
	
//	public boolean removeDup()
//    {
//    
//    	Node temp = head, del = head;
//    	while(del.getNext()!=null)
//    	{
//    		temp = del;
//    		del = del.getNext();
//    		if(temp.getData() == del.getData())
//    		{
//    			temp.setNext(del.getNext());
//    			temp = temp.getNext();
//    		}
//    		temp = temp.getNext();
//    	}
//    	del = del.getNext();
//		return false;
//    	
//    	
//    }
	
	public boolean removeDupFromSort() {
		Node curr = head;
		while(curr!= null)
		{
			Node temp = curr;
			while(temp!= null && temp.getData() == curr.getData())
			{
				temp = temp.getNext();
			}
			
			curr.setNext(temp);
			curr = curr.getNext();
		}
		return false;
		
		
		
		
	}

}
