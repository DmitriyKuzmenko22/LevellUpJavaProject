import com.sun.xml.internal.bind.v2.TODO

import java.awt.List

/**
 * Created by Дмитрий on 05.02.2017.
 */
class MainTest extends spock.lang.Specification {

    def "copyOf()"() {

        given: "Add collections"
        Collection<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(1)
        arrayList1.add(2)

        when: "copy in new list"
        Integer[] arr1 = Arrays.copyOf(arrayList1 as Integer[], arrayList1.size())
        Integer[] arr2 = Arrays.copyOf(arrayList1 as Integer[], 5)
        Integer[] arr3 = Arrays.copyOf(arrayList1 as Integer[], 2)

        then: "result new list"
        arr1.length == 3
        arr1.toString() == "[0, 1, 2]"
        arr2.length == 5
        arr2.toString() == "[0, 1, 2, null, null]"
        arr3.length == 2
        arr3.toString() == "[0, 1]"


    }

    def "copyOfRange"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(11)
        arrayList1.add(22)
        arrayList1.add(33)
        arrayList1.add(44)
        arrayList1.add(55)

        when: "Copy of Range new collections"
        Integer[] arr = Arrays.copyOfRange(arrayList1 as Integer[], 0, 3)
        Integer[] arr1 = Arrays.copyOfRange(arrayList1 as Integer[], arrayList1.first(), arrayList1.size())
        Integer[] arr2 = Arrays.copyOfRange(arrayList1 as Integer[], 4, arrayList1.size())

        then: "result collections"
        arr.length == 3
        arr.toString() == "[0, 11, 22]"
        arr1.length == 6
        arr1.toString() == "[0, 11, 22, 33, 44, 55]"
        arr2.length == 2
        arr2.toString() == "[44, 55]"
    }

    def "sort"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(23)
        arrayList1.add(5)
        arrayList1.add(55)
        arrayList1.add(61)
        arrayList1.add(7)
        arrayList1.add(22)

        when: "sort"
        Collections.sort(arrayList1)

        then: "result collections"
        arrayList1.toString() == "[0, 5, 7, 10, 22, 23, 55, 61]"
    }

    def "sort reverse"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(23)
        arrayList1.add(5)
        arrayList1.add(55)
        arrayList1.add(61)
        arrayList1.add(7)
        arrayList1.add(22)

        when: "reverse order"
        Collections.sort(arrayList1, Collections.reverseOrder())

        then: "result collectionss"
        arrayList1.toString() == "[61, 55, 23, 22, 10, 7, 5, 0]"
    }

    def "sort String"() {
        given: "Add collections"
        Collection<String> arrayList1 = new ArrayList<>();
        arrayList1.add("B")
        arrayList1.add("J")
        arrayList1.add("A")
        arrayList1.add("C")
        arrayList1.add("E")
        arrayList1.add("W")

        when: "sort"
        Collections.sort(arrayList1)

        then: "result collections"
        arrayList1.toString() == "[A, B, C, E, J, W]"
    }

    def "Binaty search"() {
        given: "Add collections"
        Collection<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(23)
        arrayList1.add(5)
        arrayList1.add(55)
        arrayList1.add(61)
        arrayList1.add(7)
        arrayList1.add(22)


        when: "BinarySeach"

        Integer index = Arrays.binarySearch(arrayList1 as Integer[], 5)

        then: "result collections"
        index == 3// ne pravil'no rabotaet

    }

    def "Fill methods"() {
        given: "Add collections"
        Collection<String> arrayList1 = new ArrayList<>();
        arrayList1.add("B")
        arrayList1.add("J")
        arrayList1.add("A")
        arrayList1.add("C")
        arrayList1.add("E")
        arrayList1.add("W")

        when: "fill all"
        Collections.fill(arrayList1, "C")

        then: "result collections"
        arrayList1.toString() == "[C, C, C, C, C, C]"

    }

    def "fill()"() {
        given: "add one more elements"
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(20)
        arrayList1.add(30)
        arrayList1.add(40)

        when: "aagg"
        Integer[] arr1 = arrayList1.toArray() as Integer[]
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length)
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length)
        Arrays.fill(arr2 as Integer[], 1)
        Arrays.fill(arr3 as Integer[], 0, 3, 70)


        then: "check"
        arr1.toString() == "[0, 10, 20, 30, 40]"
        arr2.toString() == "[1, 1, 1, 1, 1]"
        arr3.toString() == "[70, 70, 70, 30, 40]"
    }

    def "equalse()"() {
        given: "add one more elements"
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(20)
        arrayList1.add(30)
        arrayList1.add(40)

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(0)
        arrayList1.add(10)
        arrayList1.add(20)
        arrayList1.add(30)
        arrayList1.add(40)




        when: "equals elements"
        Integer[] arr1 = arrayList1.toArray() as Integer[]
        Integer[] arr2 = arrayList2.toArray() as Integer[]
        boolean arr3=Arrays.deepEquals(arr1,arr2)


        then: "result"
        arr3==false
       // TODO: "Tyt beda"

    }

    def "asList()"() {
        given: "add one more elements"
      //  TODO: "Tyt beda toje"

//        String[]a = new String[4];
//        a[0]="abc"
//        a[1]="klm"
//        a[2]="xyz"
//        a[3]="pqr"

        Integer[]b = new Integer[5];
        b[0]=10
        b[1]=20
        b[2]=30
        b[3]=40
        b[4]=50

        when: "methods"
//        List list1 = Arrays.asList(a);
        Integer[] arr1 = b.toArray() as Integer[]
        arr2=Arrays.asList(arr1)

        then: "result"
//        list1.toString()=="[abc, klm, xyz, pqr]"
        arr2.toString()=="10,20"

//        when: "methods2"
//        List list2 = Arrays.asList(a+a);
//
//        then: "result2"
//        list2.toString()=="[abc, klm, xyz, pqr, abc, klm, xyz, pqr]"

    }
}