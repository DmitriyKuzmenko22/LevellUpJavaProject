package ua.dp.levelup.list;

import ua.dp.levelup.list.DoubleList.DoubleLinkedList;
import ua.dp.levelup.list.DoubleList.NodeDouble;
import ua.dp.levelup.list.SingleList.Node;
import ua.dp.levelup.list.SingleList.SingleLinkedList;

import java.util.Objects;

/**
 * Created by Дмитрий on 29.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        SingleLinkedList doubleLinkedList = new SingleLinkedList();

        doubleLinkedList.addLast(new Node(0));
        doubleLinkedList.addLast(new Node(1));
        doubleLinkedList.addLast(new Node(2));
        doubleLinkedList.addLast(new Node(3));
        doubleLinkedList.addLast(new Node(4));
        doubleLinkedList.addLast(new Node(5));
        doubleLinkedList.addLast(new Node(6));
        doubleLinkedList.addLast(new Node(7));

        doubleLinkedList.swap(2,4);
      //  doubleLinkedList.addNode(new Node(66),3);



        System.out.println(doubleLinkedList.toString());


    }
}
