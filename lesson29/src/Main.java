import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /////jjjvff
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Citizen> list=readCSV("citizen.csv");
        System.out.println(list);
    }

    public static List<Citizen> readCSV(String fileName) {
        List<Citizen> list = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("id")) continue;
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");

                long id = scanner.nextLong();// есть строка и нужно прочитать лонговое значение  читает до;
                String fName = scanner.next();
                String lName = scanner.next();
                int age = scanner.nextInt();
                list.add(new Citizen(id, fName, lName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }

}
