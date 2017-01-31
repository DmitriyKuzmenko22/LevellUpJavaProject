package ua.dp.levelup.double_linked_list;

import ua.dp.levelup.tree.AbstractList;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by java on 31.01.2017.вап
 */
public class DoublyLinkedList<T> extends AbstractList<Node<T>> implements Iterable<Node<T>>{

    private Node<T> head=null;
    private Node<T> tail=null;
    private int size=0;

    @Override
    public void add(Node<T> node, int index) {
        if (index<0||index>size) throw new IllegalArgumentException(String.format("passed not correct index: %d", index));
          //ili index bolwe size

        if (index==0){
           addFirst(node);
        } else if(index==size){
           addLast(node);
        } else {
            Optional<Node<T>> tmp= get(index);
            if (tmp.isPresent()){//vit9givaem iz nullleble
                Node<T> oldNode=tmp.get();//y optional est' metod get i dvigaem nody dalwe
                Node<T> prevOld = oldNode.getPrev();

                prevOld.setNext(node);
                node.setPrev(prevOld);//вклинились между нодами и переставляем местами сілки для новой ноді

                node.setNext(oldNode);
                oldNode.setPrev(node);

            }

        }

    }

    @Override
    public void addFirst(Node<T> node) {
        if (null == node) return;
        if (null == head) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;

    }

    @Override
    public void addLast(Node<T> node) {
        if (null == node) return;
        if (null == tail){
            addFirst(node);
            return;
        } else{
            tail.setNext(node);
            node.setPrev(tail);
            head = node;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        if (head==null) return;
        if (size==1){
            head=null;
            tail=null;
        } else {
            head.getNext().setPrev(null);// у следующего єелмента после корня ссілка на предідущий єлемент затирается
            head=head.getNext();//наш список ссілается на следующий после первого єлемента

        }
        size--;

    }

    @Override
    public void removeLast() {
        if (head==tail) return;
        if (size==1){
            head=null;
            tail=null;
        } else {
            tail.getPrev().setNext(null);
            tail=tail.getPrev();

        }
        size--;

    }

    @Override
    public Optional<Node<T>> getFirst() {
        return Optional.ofNullable(head);
    }

    @Override
    public Optional<Node<T>> getveLast() {
        return Optional.ofNullable(tail);
    }

    @Override
    public Optional<Node<T>> get(int index) {

        if (index<0||index>size-1)
            throw new IllegalArgumentException(String.format("passed not correct index: %d", index));
        //ili index bolwe size

        Node<T> res =head;
        for (int i=0; i<=index; i++){
            res =res.getNext();
        }

        return Optional.of(res);// false ==null
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isNotEmpty() {
        return false;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new Iterator<Node<T>>() {

            private Node<T> cursor= head;

            @Override
            public boolean hasNext() {//проверяет есть ли следующий єлемент
                return null != cursor;
            }

            @Override
            public Node<T> next() { //переходит на следующий єлемент
                if (!hasNext()) throw new NoSuchElementException();
                Node<T> tmp = cursor;
                cursor=tmp.getNext();// corsor eto kaka9-to noda
                return tmp;
            }
        };
    }
    //при каждом візове нашего некста он будет переходить на следующий єлемент

    public void swap(int nodeA,int nodeB){
        if (nodeA==nodeB) return;

        Node<T> tmpA = get(nodeA).get();//nahodim eti node(optionali)
        Node<T> tmpB = get(nodeB).get();



    }

}
