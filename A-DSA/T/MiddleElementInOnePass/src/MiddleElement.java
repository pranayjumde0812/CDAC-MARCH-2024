import java.util.LinkedList;

public class MiddleElement {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        list.add(15);
        list.add(45);
        list.add(87);
        list.add(47);
        list.add(23);
        list.add(9);
        list.add(54);
        
        list.forEach(s -> System.out.print(s + " "));
        
        System.out.println("\nSize of linked list is: " + list.size());
        
        int cnt = list.size();
        int value = 0;

        MiddleElement middleElement = new MiddleElement();
        middleElement.middleEle(list, cnt);
    }

    public void middleEle(LinkedList<Integer> list, int cnt) {
        int middleIndex = cnt / 2;
        int value = list.get(middleIndex);
        System.out.println("Middle element is: " + value);
    }
}
