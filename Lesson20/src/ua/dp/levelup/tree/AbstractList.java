package ua.dp.levelup.tree;


import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public abstract class AbstractList<N> {

    protected int size=0;
//llll
    public abstract void add(N node, int index);
    public int size(){
        return size;
    }
    public abstract void addFirst(N node);
    public abstract void addLast(N node);
    public abstract void removeFirst();
    public abstract void removeLast();
    public abstract Optional<N> getFirst();
    public abstract Optional<N> getveLast();
    public abstract Optional<N> get(int index);
    public abstract boolean isEmpty();
    public abstract boolean isNotEmpty();
//
}
