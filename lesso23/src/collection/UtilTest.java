package collection;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by java on 07.02.2017.
 */
public class UtilTest {

    @Test
    public void testArraysCopyOf() {

        String[] arr = {"a", "a", "a"};
        String[] arr2 = Arrays.copyOf(arr, arr.length);

        assertTrue(Arrays.equals(arr, arr2));

        System.out.println(Arrays.binarySearch(arr, "a"));
//        System.out.println(Arrays.binarySearch(arr, "d"));


        // arr[0].intern();//нужно вернут сілку из пула строк

        //   System.out.println(Arrays.toString(arr2));

    }
        @Test
                public void testArraysAsList(){
            String[] arr = {"a", "a", "a"};
            List<String> list2=Arrays.asList(arr);
            System.out.println(list2.size());
            List<String> list3=Arrays.asList("a","b","c");

            Collections.copy(list2,list3);

            list2.forEach(System.out::println);


        }
    @Test
    public void testHash(){
        Set<Integer> intSet=new HashSet<>();
        intSet.add(1);
        intSet.add(4);
        intSet.add(3);
        intSet.add(1);
        intSet.add(2);

//        System.out.println(intSet.toString());

        Set<String> hash=new HashSet<>();
        hash.add("castle");
        hash.add("bridge");
        hash.add("castle");
        hash.add("moat");

//        System.out.println(hash);

        Set<Student> students=new HashSet<>();
        students.add(new Student(1,"Sem",22));
        students.add(new Student(2,"Bob",22));
        students.add(new Student(3,"Tom",22));
        students.add(new Student(1,"Sem",22));
        students.add(new Student(4,"Bill",24));
        students.add(new Student(3,"Sem",22));

//        System.out.println(students.size());
//        System.out.println(students);

        Set<Student> treeSet=new TreeSet<>();
        treeSet.add(new Student(1,"Sem",22));
        treeSet.add(new Student(2,"Bob",22));
        treeSet.add(new Student(3,"Tom",22));
        treeSet.add(new Student(1,"Sem",22));
        treeSet.add(new Student(4,"Bill",24));
        treeSet.add(new Student(3,"Sem",22));

        System.out.println(students.size());
        System.out.println(students);
    }
}




