package ua.dp.levelup.list.SingleListOld;

import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public abstract class AbstractList {
//
    protected int size = 0;

    public int size() {
        return size;
    }

    public abstract void addFirst(Node node);

    public abstract void addLast(Node node);

    public abstract void removeFirst();

    public abstract void removeLast();

    public abstract void swap(int nodeA, int nodeB);

    public abstract Optional<Node> getFirst();

    public abstract Optional<Node> getLast();

    public abstract Optional<Node> get(int index);

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public abstract void addNode(Node node,int index);

    public abstract void remove(int index);
}
