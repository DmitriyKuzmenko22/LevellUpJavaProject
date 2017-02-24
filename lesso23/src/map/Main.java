package map;

import java.util.*;

/**
 * Created by java on 14.02.2017.
 */
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        HashMap<String, Integer> map = new HashMap<>();
//        while (scanner.hasNext()) {
//            String word = scanner.next();
//            Integer count = map.get(word);//передаем ключ и получаем значение
//            int value = (count == null) ? 0 : count;
//            map.put(word, value + 1);
//        }
        Scanner scanner = new Scanner(System.in);//сортирем по длине слова
        HashMap<Integer, Set<String>> map = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("exit")) break;

            Set<String>set=map.get(word.length());
            if (set!=null){
                set.add(word);//

            } else {
                set = new HashSet<>();
                set.add(word);//инициализируем и добавляем новій єлемент
                map.put(word.length(), set);
            }

        }

        for (Map.Entry<Integer,Set<String>> entry: map.entrySet()){
            System.out.printf("Value = %s with size: %d\n\r", entry.getValue(), entry.getKey());
        }
/*Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.*/

    }
}
