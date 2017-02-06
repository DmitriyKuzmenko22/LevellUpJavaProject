import java.util.*;

/**
 * Created by Дмитрий on 04.02.2017.
 */

public class Main {
    public static void main(String[] args) {

        //ArrayList<String> arlst=new ArrayList<>();

//        arlst.add("TP");
//        arlst.add("PROVIDES");
//        arlst.add("QUALITY");
//        arlst.add("TUTORIALS");
//        arlst.add("DM");
//        arlst.add("TYU");


        //Collections.sort(arlst);

//        int index0= Collections.binarySearch(arlst,"TP");
//        int index1= Collections.binarySearch(arlst,"PROVIDES");
//        int index2= Collections.binarySearch(arlst,"QUALITY");
//        int index3= Collections.binarySearch(arlst,"TUTORIALS");
//        int index4= Collections.binarySearch(arlst,"DM");
//        int index5= Collections.binarySearch(arlst,"TYU");
//
//        System.out.println(index0);
//        System.out.println(index1);
//        System.out.println(index2);
//        System.out.println(index3);
//        System.out.println(index4);
//        System.out.println(index5);
//        System.out.println(arlst.toString());

//        Collection<Integer> arlst = new ArrayList<>();
//
//        arlst.add(0);
//        arlst.add(1);
//        arlst.add(2);
//        arlst.add(89);
//        arlst.add(3);
//        arlst.add(4);
//        arlst.add(5);
//        arlst.add(66);
//        arlst.add(99);
//
//        Integer[] arr1 = (Integer[]) arlst.toArray();
//        Integer[] arr2 = Arrays.copyOf(arr1,2);
//
//        System.out.println(arr2.toString());

        /*Collections.sort(arlst);

        Integer index = Collections.binarySearch(arlst, 22222);
        Integer index2 = Collections.binarySearch(arlst, 89);*/

        //arlst.remove(3);

        //  arlst.trimToSize();

        //Collections.sort(arlst, Collections.reverseOrder()); сортировка в убывающем порядке

        /*System.out.println(arlst.toString());
        System.out.println(index);
        System.out.println(index2);
        System.out.println(arlst);*/

        // ArrayList<Integer> arlst2=new ArrayList<>();

//        Collections.copy(arlst,arlst2); ne rabotaet
//        ArrayList<Integer> al2 = new ArrayList<Integer>(arlst.subList(0,5));



//        Collections.fill(arlst,990); rabotaet
//        System.out.println(arlst);

//        List list = Arrays.asList(new String[] { "A", "B", "C", "D" });
//        List list2 = Arrays.asList(new String[] { "A", "B", "C" });
//        System.out.println(list.equals(list2));
        /*ArrayList<String> iii = new ArrayList<>();
        ArrayList<String> iii2 = new ArrayList<>();

        iii.add("A");
        iii.add("F");
        iii2.add("A");
        iii2.add("F");
        TODO dvf

        System.out.println(iii.equals(iii2));

        ArrayList<Integer> dest = new ArrayList<Integer>();
        dest.addAll(arlst);
        System.out.println("Copy of " + dest);

        LinkedList<Objects> list = new LinkedList<>();*/
        List<String> srclst = new ArrayList<String>(5);
        List<String> destlst = new ArrayList<String>(10);

        // populate two lists
        srclst.add("Java");
//        srclst.add("is");
//        srclst.add("best");

//        destlst.add("Java");
//        destlst.add("is");
       destlst.add("Java");



        // copy into dest list
       // Collections.copy(destlst, srclst);

        System.out.println("Value of source list: "+srclst);
        System.out.println("Value of destination list: "+destlst);
        boolean iscommon = Collections.disjoint(srclst, destlst);
        System.out.println(iscommon);

    }
}
