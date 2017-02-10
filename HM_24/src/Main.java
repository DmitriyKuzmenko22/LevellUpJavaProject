import java.util.*;

/**
 * Created by Дмитрий on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Set<Home> homeSet=new HashSet<>();
        homeSet.add(new Home(27,"Dnepr",12,144));
        homeSet.add(new Home(27,"Kharkov",11,142));
        homeSet.add(new Home(28,"Lviv",10,148));
        homeSet.add(new Home(29,"Lviv",9,146));
        homeSet.add(new Home(30,"Kiev",8,132));
        homeSet.add(new Home(31,"Donetsk",8,130));
        homeSet.add(new Home(32,"Lugansk",6,128));
        homeSet.add(new Home(33,"Poltava",7,128));

//        System.out.println(homeSet);
//        System.out.println(homeSet.size());

        LinkedHashSet<Home> homesLinkedSet=new LinkedHashSet<>();
        homesLinkedSet.add(new Home(27,"Dnepr",12,144));
        homesLinkedSet.add(new Home(27,"Dnepr",12,144));
        homesLinkedSet.add(new Home(27,"Kharkov",11,142));
        homesLinkedSet.add(new Home(28,"Lviv",10,148));
        homesLinkedSet.add(new Home(29,"Lviv",9,146));
        homesLinkedSet.add(new Home(30,"Kiev",8,132));
        homesLinkedSet.add(new Home(31,"Donetsk",8,130));
        homesLinkedSet.add(new Home(32,"Lugansk",6,128));
        homesLinkedSet.add(new Home(33,"Poltava",7,128));
        homesLinkedSet.add(new Home(33,"Poltava",7,128));

//        System.out.println(homesLinkedSet);
//        System.out.println(homesLinkedSet.size());

        TreeSet<Home> treeSet = new TreeSet<>();
        treeSet.add(new Home(27,"Dnepr",12,144));
        treeSet.add(new Home(27,"Dnepr",12,144));
        treeSet.add(new Home(27,"Kharkov",11,142));
        treeSet.add(new Home(28,"Lviv",10,148));
        treeSet.add(new Home(29,"Lviv",9,146));
        treeSet.add(new Home(30,"Kiev",8,132));
        treeSet.add(new Home(31,"Donetsk",8,130));
        treeSet.add(new Home(32,"Lugansk",6,128));
        treeSet.add(new Home(33,"Poltava",7,128));
        treeSet.add(new Home(33,"Poltava",7,128));

        System.out.println(treeSet.size());
        System.out.println(treeSet);

//        tset.add(1);
//        tset.add(15);
//        tset.add(110);
//        tset.add(78);
//        tset.add(34);
//        tset.add(57);
//        System.out.println(tset);
//
//        TreeSet<Integer> tset2 = new TreeSet<>();
//        tset2.add(88);
//        tset2.add(7);
//        tset2.add(101);
//        tset2.add(0);
//        tset2.add(3);
//        tset2.add(222);
//        System.out.println(tset2);

    }

//
//        Iterator<Home> itr=homeSet.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }

