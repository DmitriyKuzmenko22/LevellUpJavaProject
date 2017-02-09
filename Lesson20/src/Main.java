import ua.dp.levelup.double_linked_list.DoublyLinkedList;
import ua.dp.levelup.double_linked_list.Node;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();

//        doublyLinkedList.addFirst(new Node(44));
//        doublyLinkedList.addLast(new Node(45));
        doublyLinkedList.add(new Node(55),0);
        doublyLinkedList.add(new Node(66),1);
        doublyLinkedList.add(new Node(77),2);
        doublyLinkedList.add(new Node(88),3);
        doublyLinkedList.add(new Node(99),4);

        System.out.println(doublyLinkedList.toString());
    }
}
//////ено