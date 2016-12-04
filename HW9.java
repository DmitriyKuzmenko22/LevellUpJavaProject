import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dmitriy on 03.12.2016.
 */
public class HW9 {
    static Student[] students = new Student[20];
    public static void main(String[] args) {


        Student s1 = new Student("Ron", "Weasley", 24, Lang.EN, Faculty.GRYFFINDOR);
        Student s2 = new Student("Ron", "Weasley", 24, Lang.RU, Faculty.SLYTHERIN);
        Student s3 = new Student("Anton", "Vorotnikov", 25, Lang.RU, Faculty.RAVENCLAW);
        System.out.println(randomFaculty());

        System.out.println(s2.toString());
        System.out.println(s3.toString());

        students[0] = new Student("Igor", "Troyan", 23, Lang.EN, null);
        students[1] = new Student("Alex", "Alexovich", 21, Lang.EN, null);
        students[2] = new Student("Yuri", "Yurivkod", 26, Lang.EN, null);
        students[3] = new Student("Alexey", "Aleenko", 29, Lang.EN, null);
        students[4] = new Student("Evgeniy", "Modric", 25, Lang.EN, null);
        students[5] = new Student("Pavel", "Klimov", 27, Lang.EN, null);
        students[6] = new Student("Kirill", "Klimenko", 21, Lang.EN, null);
        students[7] = new Student("Anton", "Kosov", 19, Lang.EN, null);
        students[8] = new Student("Denis", "Ivanov", 12, Lang.EN, null);
        students[9] = new Student("Gennadiy", "Petrov", 26, Lang.EN, null);
        students[10] = new Student("Georgiy", "Kuzntsov", 20, Lang.EN, null);
        students[11] = new Student("Ivan", "Usipov", 22, Lang.EN, null);
        students[12] = new Student("Dmitriy", "Sokolov", 31, Lang.EN, null);
        students[13] = new Student("Stanislav", "Rebrov", 24, Lang.EN, null);
        students[14] = new Student("Oleg", "Konovalod", 25, Lang.EN, null);
        students[15] = new Student("Roman", "Pidor", 21, Lang.EN, null);
        students[16] = new Student("Vladimir", "Rud", 26, Lang.EN, null);
        students[17] = new Student("Viktor", "Sipov", 27, Lang.EN, null);
        students[18] = new Student("Ilya", "Sedorenko", 28, Lang.EN, null);
        students[19] = new Student("Edik", "Grin", 29, Lang.EN, null);
        feelStudentList();


            /*Дан массив из 20 студентов. Определить к какому факультету в школе магии Хогвартс будет зачислен каждый из них.
            Учесть то, что к каждому факультету может быть зачислено не более пяти новых студентов.
            Также факультеты могут быть определены только случайным образом.*/



        }


    public static void feelStudentList() {
        int count[] = new int[Faculty.values().length];
        for (Student x: students) {
            while (true){
                Faculty f = randomFaculty();
                if(f.equals(Faculty.GRYFFINDOR) && count[0] < 5 ){
                    x.faculty = f;
                    count[0]++;
                    break;
                }
                else if (f.equals(Faculty.HUFFLEPUFF)&& count[1]<5){
                    x.faculty = f;
                    count[1]++;
                    break;
                }
                else if (f.equals(Faculty.RAVENCLAW)&& count[2]<5){
                    x.faculty = f;
                    count[2]++;
                    break;
                }
                else if (f.equals(Faculty.SLYTHERIN)&& count[3]<5){
                    x.faculty = f;
                    count[3]++;
                break;
                }
            }
            System.out.println(x.toString());
        }


    }

    /*Написать программу, которая случайным образом возвращает факультет в виде перечисления: GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW.
        * Использовать для выполнения метод nextInt(), который можно вызвать у экземпляра класса Random.*/
    // System.out.println(Arrays.toString(Faculty.values()));
    public static Faculty randomFaculty(){
        Random random = new Random();
        return Faculty.values()[random.nextInt(Faculty.values().length)];
    }
}


//        Scanner scanner=new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter operat: ");
//
//            String operator = scanner.next();
//            System.out.print("Enter first operand: ");
//            int a = scanner.nextInt();
//
//            System.out.print("Enter second operand: ");
//            int b = scanner.nextInt();
//
//            switch (operator) {
//
//                case "+":
//                    System.out.print((a + operator + b) + " = " + calc.sum(a, b));
//                    break;
//                case "-":
//                    System.out.print((a + operator + b) + " = " + calc.vich(a, b));
//                    break;
//                case "/":
//                    System.out.print((a + operator + b) + " = " + calc.del(a, b));
//                    break;
//                case "*":
//                    System.out.print((a + operator + b) + " = " + calc.umn(a, b));
//                    break;
//            }
//            System.out.print(" Would you like to cintinue? Enter y/n ");
//
//            String exitWord = scanner.next();
//            if(exitWord!=null&&!exitWord.isEmpty()&&!exitWord.equalsIgnoreCase("y")) break;
//        }



