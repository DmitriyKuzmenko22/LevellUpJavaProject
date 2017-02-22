import DMDSoft_Solutions.Factory;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Дмитрий on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Factory DMDSoft_Solutions = new Factory("DMDSoft_Solutions");
      /*  DMDSoft_Solutions.add("DEVELOPER", "0", "Kuzmenko", "Dmitriy", "1900");
        DMDSoft_Solutions.add("DEVELOPER","1","Petrov","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","0","Petrov","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","1","Ivanod","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","2","Petrov2","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","3","Ivanod2","Ivan","900");
        DMDSoft_Solutions.add("DESINGER","4","Petrov3","Ivan","900");*/




        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) break;

            else if (line.startsWith("comm")) {
                System.out.println("add [deparmnet] [employeeId] [firstName] [lastName] [salary]");
                System.out.println("get [deparment] [employeeId]");
                System.out.println("DepartmentDetails [deparment]");
                System.out.println("getAll");

            } else if (line.startsWith("add")) {
                DMDSoft_Solutions.add(line.split(" "));

            } else if (line.startsWith("get")) {
              //  if (line.split(" ").length==3){
                DMDSoft_Solutions.get(line.split(" "));
                    }

             else if (line.startsWith("DepartmentDetails")){
               // if (line.split("").length==2) {
                    DMDSoft_Solutions.getis(line.split(" "));
                }
                }
            }

        }








