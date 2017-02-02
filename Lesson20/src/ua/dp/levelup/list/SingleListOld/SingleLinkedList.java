package ua.dp.levelup.list.SingleListOld;

import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public class SingleLinkedList extends AbstractList {

    private Node root = null;

    @Override
    public void addFirst(Node node) {
        if (null == node) return;
        if (null == root) {
            root = node;
        } else {
            node.setNext(root);
            root = node;
        }
        size++;
    }

    @Override
    public void addLast(Node node) {
        if (null == node) return;
        if (null == root) {
            root = node;
        } else {
            Node tmp = root;
            while (tmp.next() != null) {
                tmp = tmp.next();
            }
            tmp.setNext(node);
        }
        size++;
    }

    @Override
    public void removeFirst() {
        Node first = root;
        if (null == first) return;   //do nothing
        if (first.next() != null) {
            root = first.next();    //can be null, if list size = 1
            first.setNext(null);
        } else {
            root = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        Node first = root;
        if (null == first) return;   //do nothing
        if (null == first.next()) {
            root = null;            //in case when list size = 1
        } else {
            Node tmp = first.next();
            Node prev = tmp;
            while (null != tmp.next()) {
                prev = tmp;
                tmp = tmp.next();
            }
            prev.setNext(null);
        }
        size--;

    }

    @Override
    public void swap(int nodeA, int nodeB) {
        if (nodeA < 0 || nodeA >= size || nodeB < 0 || nodeB > size || size < 2) return;
        Node prevA = root;//1
        Node tmpA = prevA.next();//2
        Node prevB = root;//1
        Node tmpB = prevB.next();//2
        Node nextB;

        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            if (currentIndex == nodeA - 1) break;
            prevA=prevA.next();//2
            tmpA=prevA.next();//3
        }

        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            if (currentIndex == nodeB - 1) break;
            prevB =prevB.next();//5
            tmpB =prevB.next();//6
        }
        nextB=tmpB.next();//4
        prevA.setNext(tmpB);
        prevB.setNext(tmpA);
        tmpB.setNext(tmpA.next());
        tmpA.setNext(nextB);
    }

    @Override
    public Optional<Node> getFirst() {
        return Optional.ofNullable(root);// проверяем на налл
    }

    @Override
    public Optional<Node> getLast() {
        Node last = root;
        while (last != null && last.next() != null) {
            last = last.next();
        }
        return Optional.ofNullable(last);
    }

    @Override
    public Optional<Node> get(int index) {
        if (index < 0 || index >= size) return Optional.empty(); //check for invalid index
        Node result = root;
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            if (currentIndex == index) break;
            result = result.next();
        }
        return Optional.of(result);
    }

    @Override
    public boolean isEmpty() {
        return null == root;
    }

    @Override
    public boolean isNotEmpty() {
        return !isEmpty();
    }

    @Override
    public void addNode(Node node, int index) {
        if (index < 0 || index >= size) return;
        else if (index==size){
            addLast(node);
            return;
        }
        else if (index==0){
            addFirst(node);
            return;
        }
        else {
            Node previous=root;//1
            Node tmp=previous.next();//2
            for (int currentIndex = 0; currentIndex<=index-1; currentIndex++){//4
                previous=previous.next();//4
                tmp=tmp.next();//5
            }
            previous.setNext(node);
            node.setNext(tmp);

        }

    }

    @Override
    public void remove(int index) { //8
        if (index < 0 || index >= size) return;
        if (index == 0) return;
        Node result = root;
        Node prev;

        for (int currentIndex = 1; currentIndex<=index-1; currentIndex++) {
            result = result.next();//9
        }
        result.setNext(result.next().next());
        size--;
    }
}


