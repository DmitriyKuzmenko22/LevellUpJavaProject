package three;

import java.util.Comparator;

/**
 * Created by java on 27.01.2017.
 */
public class BinaryTree<T> implements Tree<T> {


    class Node<V> {
        private Node<V> parent;
        private Node<V> left;
        private Node<V> right;
        private V value;

        public Node(V value) {
            this.value = value;
        }


        public Node<V> getParent() {
            return parent;
        }

        public void setParent(Node<V> parent) {
            this.parent = parent;
        }

        public Node<V> getLeft() {
            return left;
        }

        public void setLeft(Node<V> left) {
            left.setParent(this);//mi nahodimsya seyshav v nem v etou node
            this.left = left;
        }

        public Node<V> getRight() {
            return right;
        }

        public void setRight(Node<V> right) {
            right.setParent(this);
            this.right = right;
        }

        public V getValue() {
            return value;
        }

        public void setData(Object data) {
            this.value = value;
        }
    }

    private Node<T> root; // opesivaem svoystva classa
    private int size = 0;

    private final Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;// -1 0 1 vozvrashaet
    }

    @Override
    public void add(T value) {
        if (null == root) {
            root = new Node<>(value);
        } else {
            add(value, root);

        }


    }

    private void add(T val, Node<T> parent) {
        if (comparator.compare(val, root.getValue()) < 0) {
            //left
            if (parent.getLeft() == null) {
                parent.setLeft(new Node<>(val));
            } else {
                add(val, parent.getLeft());
            }
        } else if (comparator.compare(val, root.getValue()) > 0) {
            //right
            if (parent.getRight() == null) {
                parent.setLeft(new Node<>(val));
            } else {
                add(val, parent.getRight());
            }
        }
    }


    @Override
    public void addAll(T[] value) {

    }

    @Override
    public void remove(T value) {

    }

    @Override
    public void print() {
        if (null == root) return;
        printChild(root);

    }

    @Override
    public Node<T> findValue(T value) {
        Node<T> tmp = root;
        for (int i = 0; i <size; i++) {
            if (null == tmp) return tmp;
            else if (comparator.compare(value,tmp.getValue())==-1) tmp=tmp.getLeft();//menshe perviy
            else if (comparator.compare(value,tmp.getValue())==1) tmp=tmp.getRight();//bolshe vtoroy
            else if (comparator.compare(value,tmp.getValue())==0) return tmp;//ravni

        }
        return tmp;

    }


    private void printChild(Node<T> parent) {
        if (parent.getLeft() != null) {
            printChild(parent.getLeft());
        }

        System.out.println(parent.getValue());


        if (parent.getRight() != null) {
            printChild(parent.getRight());
        }
    }
    public void delete(T value) {
        root = delete(root, value);
    }

    private Node delete(Node startNode, T value) {
        Node<T> element = findValue(value);
        if (element == null) return startNode;
        boolean hasParent = element.getParent() != null;
        boolean isLeft = hasParent && element.getValue() < element.getParent().getValue();
        if (element.getLeft() == null && element.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(null);
                } else {
                    element.getParent().setRight(null);
                }
            }
        } else if (element.getLeft() != null && element.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(element.getLeft());
                } else {
                    element.getParent().setRight(element.getLeft());
                }
            } else {
                startNode = element.getLeft();
            }
        } else if (element.getLeft() == null && element.getRight() != null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(element.getRight());
                } else {
                    element.getParent().setRight(element.getRight());
                }
            } else {
                startNode = element.getRight();
            }
        } else {
            Node rightMin = findMin(element.getRight());
            element.setData(rightMin.getValue());
            return delete(rightMin, (T) rightMin.getValue());
        }
        element = null;
        return startNode;
    }

    public Node findMin(Node<T> right) {
        Node min = root;
        if (min == null) return null;
        while (min.getLeft() != null) {
            min = min.getLeft();
        }
        return min;
    }

}
