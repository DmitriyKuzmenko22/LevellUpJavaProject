import DMDSoft_Solutions.Factory;

import java.io.*;
import java.util.*;

/**
 * Created by Дмитрий on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Factory DMDSoft_Solutions = new Factory("DMDSoft_Solutions");
       /* DMDSoft_Solutions.add("DEVELOPER", "0", "Kuzmenko", "Dmitriy", "1900");
        DMDSoft_Solutions.add("DEVELOPER","1","Petrov","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","0","Petrov","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","1","Ivanod","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","2","Petrov2","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","3","Ivanod2","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","4","Petrov3","Ivan","900");*/

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Васька", 5);
        hashMap.put("Мурзик", 8);
        hashMap.put("Рыжик", 12);
        hashMap.put("Барсик", 5);
        hashMap.put("Барсик", 5);

        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        int value = hashMap.get("Рыжик");

        System.out.println(hashMap.containsKey("Рыжик") + " "+ " test");
        System.out.println(hashMap.containsValue(6) + " "+ " test2");
        System.out.println(hashMap.containsValue(5) + " "+ " test3");
       /* hashMap.put("Рыжик", value + 3);
        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));*/

        Set<String> keys=hashMap.keySet();
        System.out.println("keys = "+ keys);

        Collection<Integer> values=hashMap.values();
        System.out.println(" values = "+ values);



        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) break;

            else if (line.startsWith("comm")) {
                System.out.println("add [deparmnet] [employeeId] [firstName] [lastName] [salary]");
                System.out.println("get [deparment] [employeeId]");
                System.out.println("getis [deparment]");
                System.out.println("getAll");

            } else if (line.startsWith("add")) {
                DMDSoft_Solutions.add(line.split(" "));

            } else if (line.split(" ")[0].equalsIgnoreCase("get")) {
                DMDSoft_Solutions.get(line.split(" "));
                    }

             else if (line.split(" ")[0].equalsIgnoreCase("getis")){
                    DMDSoft_Solutions.getis(line.split(" "));
                }
            else if (line.split(" ")[0].equalsIgnoreCase("getAll")){
                DMDSoft_Solutions.getAll();
            }
                }
            }

        }








