package ua.dp.levelup.list.DoubleList;

import ua.dp.levelup.list.SingleList.Node;

import java.util.Optional;

/**
 * Created by Дмитрий on 29.01.2017.
 */
public class DoubleLinkedList extends AbstractLinkedListDouble {

    private NodeDouble head = null;
    private NodeDouble tail = null;


    public NodeDouble getHead() {
        return head;
    }

    public NodeDouble getTail() {
        return tail;
    }

    @Override
    public void addFirst(NodeDouble node) {
        if (null == node) return;
        else if (null == head) {
            head = node;
            head.setPred(null);
            head.setNext(null);
        } else {
            node.setNext(head);
            head = node;
            node.setPred(null);
        }
        size++;

    }

    @Override
    public void addLast(NodeDouble node) {
        if (null == node) return;
        else if (null == head) {
            head = node;
            head.setPred(null);
            head.setNext(null);
        } else {
            NodeDouble tmp = head;
            while (tmp.next() != null) {
                tmp = tmp.next();
            }
            tmp.setNext(node);
            node.setPred(tmp);
            tail = node;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        NodeDouble first = head;
        if (null == first) return;
        if (first.next() != null) {
            head = first.next();
            first.setNext(null);
            first.setPred(null);
            head.setPred(null);
        } else {
            head = null;
        }
        if (null == head.next()) {
            tail = head;
        }
        size--;

    }

    @Override
    public void removeLast() {
        NodeDouble first = head;
        if (null == first) return;
        if (null == first.next()) {
            head = null;
            tail = null;
        } else {
            NodeDouble tmp = first.next();
            NodeDouble prev = tmp;
            while (null != tmp.next()) {
                prev = tmp;
                tmp = tmp.next();
            }
//            prev.setNext(null);
//            tmp=null;
//            tmp.setPred(null);
            tail = prev;

        }
        size--;

    }

    ///////////////////////////////////////////////////
    @Override
    public Optional<NodeDouble> getFirst() {
        return Optional.ofNullable(head);
    }

    @Override
    public Optional<NodeDouble> getLast() {
        return Optional.ofNullable(tail);

    }

    @Override
    public Optional<NodeDouble> get(int index) {
        if (index < 0 || index >= size) return Optional.empty(); //check for invalid index
        NodeDouble result = head;
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            if (currentIndex == index) break;
            result = result.next();
        }
        return Optional.of(result);
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
    public void addNode(NodeDouble node, int index) {
        if (index < 0 || index >= size) return;
        else if (index == size) {
            addLast(node);
            return;
        } else if (index == 0) {
            addFirst(node);
            return;
        } else {
            NodeDouble previous = head;//1
            NodeDouble tmp = previous.next();//2
            for (int currentIndex = 0; currentIndex < index-1; currentIndex++) {//4
                previous = previous.next();//3
                tmp = previous.next();//4
            }
            previous.setNext(node);
            node.setPred(previous);
            node.setNext(tmp);
            // previous.setPred(previous);
            tmp.setPred(node);
        }
        size++;
    }


    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) return;
        NodeDouble prev = head;
        NodeDouble tmp = prev.next();

        for (int currentIndex = 0; currentIndex <= index - 1; currentIndex++) {//6
            prev = prev.next();//5
            tmp = prev.next();//6
        }
        prev.setNext(tmp.next());//7
        prev.setPred(prev);//5
//            tmp = null;
//            tmp.setNext(null);
//            tmp.setPred(null);
        size--;

    }
}

