package ua.dp.levelup.list;

import ua.dp.levelup.tree.AbstractList;

import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public class SingleLinkedList extends AbstractList<Node<T>> {

    private Node<T> root=null;

    @Override
    public void addFirst(Node<T> node) {
        if (null==node) return;
        if (null==root){
            root=node;
        } else {
            node.setNext(root);
            root=node;
        }
        size++;

    }
/////////ll
    @Override
    public void addLast(Node<T> node) {
        if (null==node) return;
              if (null==root){
                root=node;
            } else {
                Node<T> tmp =root;
                while (tmp.next()!=null){
                    tmp = tmp.next();
                }
                tmp.setNext(node);
            }
            size++;
        }



    @Override
    public void removeFirst() {
        Node<T> first=root;
        if (null==first) return;
        if (first.next()!=null){
            root=first.next();
            first.setNext(null);
        } else {
            root=null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        Node<T> first=root;
        if (null==first) return;
        if (null==first.next()){
            root=null;
        } else {
            Node<T> tmp=first.next();
            Node<T> prev=tmp;
            while (null!=tmp.next()){
                prev=tmp;//predposledniy element, sohranyaem predposledniy element
                tmp=tmp.next();//posledniy element
            }
            prev.setNext(null);
        }
        size--;

    }

    @Override
    public Optional<Node<T>> getFirst() {
        return Optional.ofNullable(root); //nash ob'eckt mojet' bit' null'om
    }

    @Override
    public Optional<Node<T>> getveLast() {
            Node<T> last =root;
            while (last!=null&&last.next()!=null){ //должні добежать до последнего єлемента, ссылаемся на послдений элемент
                last = last.next();
            }
           return  Optional.ofNullable(last);
        }



    @Override
    public Optional<Node<T>> get(int index) {
        if (index<0||index>=size) return Optional.empty(); //если обратились с невалиднім индексом то досвидание
        Node<T> result=root;
        for (int currentIndex=0; currentIndex<size;currentIndex++){
            if (currentIndex==index)break;
            result=result.next();//переходим на следующим єлемент которій ищем
        }

        return Optional.of(result);// provetyaem na null? est' li znachenie
    }

    @Override
    public boolean isEmpty() {

        return null==root;
    }

    @Override
    public boolean isNotEmpty() {
        return !isEmpty();
    }
}
