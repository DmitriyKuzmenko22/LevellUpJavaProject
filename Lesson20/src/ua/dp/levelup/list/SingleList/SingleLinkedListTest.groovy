package ua.dp.levelup.list.SingleList

import spock.lang.Specification
<<<<<<< HEAD:Lesson20/src/ua/dp/levelup/list/SingleLinkedListTest.groovy

=======
import ua.dp.levelup.list.SingleList.Node
import ua.dp.levelup.list.SingleList.SingleLinkedList

///
>>>>>>> origin/master:Lesson20/src/ua/dp/levelup/list/SingleList/SingleLinkedListTest.groovy
/**
 * Created by java on 24.01.2017.апр
 */
class SingleLinkedListTest extends Specification {

    def "add first node to empty list"() {
        SingleLinkedList list = new SingleLinkedList();

        when: 'aded node element'
        list.addFirst(new groovy.util.Node(1));

        then: 'check size'
        list.size() == 1
        list.getFirst().isPresent() //усть ли результат?? вернули налл - значит фолс
        list.getFirst().get().value == 1
/////////ll
    }

    def "add last node to empty list"() {
        SingleLinkedList list = new SingleLinkedList();

        when: 'add node element'
        list.addFirst(new Node(1));
        list.addLast(new Node(5));

        then: 'check size'
        list.size() == 2
        list.getFirst().isPresent()
        list.getFirst().get().value == 1
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

        list.addFirst(new groovy.util.Node(1))

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
