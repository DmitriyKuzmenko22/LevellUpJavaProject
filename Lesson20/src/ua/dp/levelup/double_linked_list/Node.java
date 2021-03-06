package ua.dp.levelup.double_linked_list;

/**
 * Created by java on 31.01.2017.вап
 */
public class Node<V>{
    private Node<V> next=null;
    private Node<V> prev=null;
    private final V value;

    public Node(V value) {
        this.value = value;
    }

    public Node<V> getNext() {
        return next;
    }

    public void setNext(Node<V> next) {
        this.next = next;
//        if (next!=null) {next.setPrev(this);//
//    }
    }

    public Node<V> getPrev() {
        return prev;
    }

    public void setPrev(Node<V> prev) {
        this.prev = prev;
//        if (prev != null) {
//            prev.setNext(this);//мі у предідущего ставим себя(следующим я буду у тебя)
//        }
    }

    public V getValue() {
        return value;
    }
}