package ua.dp.levelup.list;

import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public class SingleLinkedList extends AbstractList {

    private Node root=null;





    @Override
    public void addFirst(Node node) {
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
    public void addLast(Node node) {
        if (null==node) return;
              if (null==root){
                root=node;
            } else {
                Node tmp =root;
                while (tmp.next()!=null){
                    tmp = tmp.next();
                }
                tmp.setNext(node);
            }
            size++;
        }



    @Override
    public void removeFirst() {
        Node first=root;
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
        Node first=root;
        if (null==first) return;
        if (null==first.next()){
            root=null;
        } else {
            Node tmp=first.next();
            Node prev=tmp;
            while (null!=tmp.next()){
                prev=tmp;//predposledniy element, sohranyaem predposledniy element
                tmp=tmp.next();//posledniy element
            }
            prev.setNext(null);
        }
        size--;

    }

    @Override
    public Optional<Node> getFirst() {
        return Optional.ofNullable(root); //nash ob'eckt mojet' bit' null'om
    }

    @Override
    public Optional<Node> getveLast() {
            Node last =root;
            while (last!=null&&last.next()!=null){ //должні добежать до последнего єлемента, ссылаемся на послдений элемент
                last = last.next();
            }
           return  Optional.ofNullable(last);
        }



    @Override
    public Optional<Node> get(int index) {
        if (index<0||index>=size) return Optional.empty(); //если обратились с невалиднім индексом то досвидание
        Node result=root;
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
