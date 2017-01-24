package ua.dp.levelup.list

import spock.lang.Specification

/**
 * Created by java on 24.01.2017.
 */
class SingleLinkedListTest extends Specification {

    def "add first node to empty list"() {
        SingleLinkedList list = new SingleLinkedList();

        when: 'aded node element'
        list.addFirst(new Node(1));

        then: 'check size'
        list.size() == 1
        list.getFirst().isPresent() //усть ли результат?? вернули налл - значит фолс
        list.getFirst().get().value == 1
//
    }

    def "add null node to empty list"() {
        SingleLinkedList list = new SingleLinkedList();

        when: 'aded node element'
        list.addFirst(null);

        then: 'check size'
        list.size() == 0
        !list.getFirst().isPresent() //усть ли результат?? вернули налл - значит фолс


    }


    def "addFirst null node to  list with one element"() {
        SingleLinkedList list = new SingleLinkedList();

        list.addFirst(new Node(1))

        when: 'aded node element'
        list.addFirst(null);

        then: 'check size'
        list.size() == 1
        !list.getFirst().isPresent() //усть ли результат?? вернули налл - значит фолс

        list.getFirst().get().value==1

    }

//        def "add first to list with one element"() {
//        SingleLinkedList list=new SingleLinkedList();
//
//        list.addFirst(new Node(5))
//        when: ''
//
//    }
}
