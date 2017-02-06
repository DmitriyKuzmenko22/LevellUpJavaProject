import spock.lang.Specification

/**
 * Created by Дмитрий on 05.02.2017.
 */
class CollectionsTest extends Specification {
    def "copy()"() {

        given: "Add collections"
        List<String> srclst = new ArrayList<String>();
        List<String> destlst = new ArrayList<String>();
        srclst.add("Java");
        srclst.add("is");
        srclst.add("best");

        destlst.add("C++");
        destlst.add("is");
        destlst.add("older");

        when: "copy in new list"
        Collections.copy(destlst, srclst);
        boolean iscommon = Collections.disjoint(srclst, destlst);


        then: "result"
        destlst.toString() == "[Java, is, best]"
        srclst.toString() == "[Java, is, best]"
        iscommon == false

    }

    def "copy2()"() {

        given: "Add collections"
        List<Integer> srclst = new ArrayList<>();
        List<Integer> destlst = new ArrayList<>();
        srclst.add(22);
        srclst.add(33);
        srclst.add(44);

        destlst.add(55);
        destlst.add(66);
        destlst.add(77);

        when: "copy in new list"
        Collections.copy(destlst, srclst);
        boolean iscommon = Collections.disjoint(srclst, destlst);

        then: "result"
        destlst.toString() == "[22, 33, 44]"
        iscommon == false

    }

    def "Fill methods"() {
        given: "Add collections"
        Collection<String> arrayList1 = new LinkedList<>();
        arrayList1.add("B")
        arrayList1.add("J")
        arrayList1.add("A")
        arrayList1.add("C")
        arrayList1.add("E")
        arrayList1.add("W")

        when: "fill all"
        Collections.fill(arrayList1, "C")
        //Collections.fill(arrayList1,0,2,"E")

        then: "result collections"
        arrayList1.toString() == "[C, C, C, C, C, C]"

    }

    def "Fill methods2"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new LinkedList<>();
        arrayList1.add(0)
        arrayList1.add(1)
        arrayList1.add(2)
        arrayList1.add(3)
        arrayList1.add(4)
        arrayList1.add(5)

        when: "fill all"
        Collections.fill(arrayList1, 8)

        then: "result collections"
        arrayList1.toString() == "[8, 8, 8, 8, 8, 8]"
    }

    def "frequency methods"() {
        given: "Add collections"
        Collection<String> arrayList1 = new LinkedList<>();
        arrayList1.add("A")
        arrayList1.add("D")
        arrayList1.add("B")
        arrayList1.add("C")
        arrayList1.add("C")
        arrayList1.add("D")
        arrayList1.add("D")
        arrayList1.add("D")
        arrayList1.add("DA")
        arrayList1.add("DA")
        arrayList1.add("DA")

        when: "fill all"
        Integer freqC = Collections.frequency(arrayList1, "C");
        Integer freqD = Collections.frequency(arrayList1, "DA");
        Integer freqY = Collections.frequency(arrayList1, "DAM");

        then: "result collections"
        freqC == 2
        freqD == 3
        freqY == 0
    }

    def "Sublist methods"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new LinkedList<>();
        arrayList1.add(0)
        arrayList1.add(30)
        arrayList1.add(40)
        arrayList1.add(50)
        arrayList1.add(60)

        when: "sublist all"
        LinkedList<Integer> al2 = new LinkedList<>(arrayList1.subList(0, 3));
        LinkedList<Integer> al3 = new LinkedList<>(arrayList1.subList(arrayList1.first(), arrayList1.size()));
        LinkedList<Integer> a14 = new LinkedList<>(arrayList1.subList(1, arrayList1.size() - 1));

        then: "result collections"
        al2.toString() == "[0, 30, 40]"
        al3.toString() == "[0, 30, 40, 50, 60]"
        a14.toString() == "[30, 40, 50]"

    }

    def "LastIndexSublist methods"() {
        given: "Add collections"
        LinkedList<Integer> linkedL1 = new LinkedList<>()
        LinkedList<Integer> linkedL2 = new LinkedList<>()
        linkedL1.add(0)
        linkedL1.add(30)
        linkedL1.add(40)
        linkedL1.add(50)
        linkedL1.add(60)

        linkedL2.add(30)
        linkedL2.add(40)
        linkedL2.add(50)
//        linkedL2.add(0)

        when: "sublist all"
        Integer index = Collections.lastIndexOfSubList(linkedL1, linkedL2)


        then: "result collections"
        index == 1

        //TODO "ne ponyatno po kakim kriteriam vozvrashaet"
    }

    def "list()"() {

        given: "add list"
        ArrayList<String> List1 = new LinkedList<>()

        Vector v = new Vector()
        v.add("B");
        v.add("A");
        v.add("F");
        v.add("K");
        v.add("E");
        Enumeration e = v.elements()

        when: "use list()"
        List1 = Collections.list(e)

        then: "check"
        List1.toString() == "[B, A, F, K, E]"
    }

    def "Max()&& Min() method"() {
        given: "new collection"
        LinkedList<Integer> list = new LinkedList<Integer>();

        when: "add collections"
        list.add(-18);
        list.add(40);
        list.add(-45);
        list.add(12);

        then: "result"
        Collections.max(list, null) == 40
        Collections.min(list, null) == -45
    }

    def "nCopies method"() {

        given: "new list"

        LinkedList<String> list = Collections.nCopies(5, "Point");
        ArrayList list2 = Collections.nCopies(2, "Point");

        when: "add list"
        list.add("re")
        list.add("de")
        list2.add("pe")
        list2.add("se")

        then: "result"
        list.toString() == "[Point, Point, Point, Point, Point, re, de]"
        list2.toString() == "[Point, Point, pe, se]"

    }

    def "replace method"() {

        given: "new list"
        Vector vector = new Vector();
        Vector vector2 = new Vector();


        when: "add list"
        vector.add("re")
        vector.add("de")
        vector.add("pe")
        vector.add("se")
        vector.add("de")

        vector2.add(2)
        vector2.add(3)
        vector2.add(4)
        vector2.add(4)
        vector2.add(5)
        vector2.add(6)
        vector2.add(4)

        Collections.replaceAll(vector, "de", "Replacy old symbol")
        Collections.replaceAll(vector2, 4, "ReplacyOldSymbol")

        then: "result"
        vector.toString() == "[re, Replacy old symbol, pe, se, Replacy old symbol]"
        vector2.toString() == "[2, 3, ReplacyOldSymbol, ReplacyOldSymbol, 5, 6, ReplacyOldSymbol]"
    }

    def "reverse method"() {
        given: "new LinkedList"
        LinkedList<String> arrList = new LinkedList<>()
        LinkedList<Integer> arrList1 = new LinkedList<>()

        when: "add and methods"
        arrList.add("B")
        arrList.add("A")
        arrList.add("F")
        arrList.add("O")
        arrList.add("P")
        arrList.add("C")
        Collections.reverse(arrList)

        arrList1.add(5)
        arrList1.add(6)
        arrList1.add(1)
        arrList1.add(9)
        arrList1.add(10)
        arrList1.add(99)
        Collections.reverse(arrList1)

        then: "result"
        arrList.toString() == "[C, P, O, F, A, B]"
        arrList1.toString() == "[99, 10, 9, 1, 6, 5]"

    }

    def "reverseOrder method"() {
        given: "new LinkedList"
        LinkedList<Integer> arrList = new LinkedList<>()

        when: "add and methods"
        arrList.add(5)
        arrList.add(-6)
        arrList.add(1)
        arrList.add(-9)
        arrList.add(10)
        arrList.add(99)
        Comparator cmp = Collections.reverseOrder()
        Collections.sort(arrList, cmp)


        then: "result"

        arrList.toString() == "[99, 10, 5, 1, -6, -9]"

    }

    def "rotate method"() {
        given: "new LinkedList"
        LinkedList<Integer> arrList = new LinkedList<>()
        LinkedList<String> arrList1 = new LinkedList<>()

        when: "add linkedlist"
        for (int i = 0; i <= 20; i++) {
            arrList.add(i);
        }

        arrList1.add("A")
        arrList1.add("B")
        arrList1.add("C")
        arrList1.add("D")

        Collections.rotate(arrList, 2)
        Collections.rotate(arrList1, 2)
        then: "result"
        arrList.toString() == "[19, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]"
        arrList1.toString() == "[19, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]"
    }

    def "shuffle method"() {
        given: "new LinkedList"
        LinkedList<Integer> arrList = new LinkedList<>()
        LinkedList<String> arrList1 = new LinkedList<>()

        when: "add linkedlist"
        for (int i = 0; i <= 20; i++) {
            arrList.add(i);
        }

        arrList1.add("A")
        arrList1.add("B")
        arrList1.add("C")
        arrList1.add("D")

        Collections.shuffle(arrList)
        Collections.shuffle(arrList1)
        then: "result"
        arrList.toString()
        arrList1.toString()
    }

    def "sort method"() {
        given: "new LinkedList"
        LinkedList<Integer> arrList = new LinkedList<>()
        LinkedList<String> arrList1 = new LinkedList<>()

        when: "add linkedlist"

        arrList.add(1);
        arrList.add(4);
        arrList.add(2);
        arrList.add(3);
        arrList.add(7);
        arrList.add(6);
        arrList.add(69);
        arrList.add(55);


        arrList1.add("B")
        arrList1.add("A")
        arrList1.add("D")
        arrList1.add("C")

        Collections.sort(arrList)
        Collections.sort(arrList1)
        then: "result"
        arrList.toString()=="[1, 2, 3, 4, 6, 7, 55, 69]"
        arrList1.toString()=="[A, B, C, D]"
    }

    def "swap method"() {
        given: "new LinkedList"
        LinkedList<Integer> arrList = new LinkedList<>()
        LinkedList<String> arrList1 = new LinkedList<>()

        when: "add linkedlist"

        arrList.add(1);
        arrList.add(4);
        arrList.add(2);
        arrList.add(3);
        arrList.add(7);
        arrList.add(6);
        arrList.add(69);
        arrList.add(55);
        arrList1.add("B")
        arrList1.add("A")
        arrList1.add("D")
        arrList1.add("C")

        Collections.swap(arrList,0,6)
        Collections.swap(arrList1,0,2)
        then: "result"
        arrList.toString()=="[69, 4, 2, 3, 7, 6, 1, 55]"
        arrList1.toString()=="[D, A, B, C]"
    }

}