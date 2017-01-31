package ua.dp.levelup.list;

/**
 * Created by java on 24.01.2017.
 */
public class Node<T> {
/////////llвап
   private Node<T> next = null;
   private Object value;

    public Node<T> next() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node(Object value) {
        this.value = value;
    }


}
