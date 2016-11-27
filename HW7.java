import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

//        StringBuilder builder = new StringBuilder();
//
//        builder.append(" Hello ");
//
//        builder.append(" World ");
//
//        builder.append('!');
//
//        String result = builder.toString();
//        System.out.println(result);
        ////////////
       // String email = "kuzmenkodmitriy@privatbank.com";

        //   isOneA(args);
        //isThree();
        // isTwo(2, 9);
        // isFour(2);
        //  isFive();
       // isSix(email);

    }

    static int InputInt() {
        Scanner x = new Scanner(System.in);
        int dan1 = x.nextInt();
        return dan1;


    }

    //Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
    //  год не является високосным;
//2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).
    public static void isOneA(String[] args) {
        System.out.println("Введите номер месяца: ");
        int month = InputInt();
        switch (month) {

            case 1:
                System.out.println("В Январе 31 день");
                break;

            case 2:
                System.out.println(isOneB(args));
                break;

            case 3:
                System.out.println("В Марте 31 день");
                break;

            case 4:
                System.out.println("В Апреле 30 дней");
                break;

            case 5:
                System.out.println("В Мае 31 дней");
                break;

            case 6:
                System.out.println("В Июне 30 дней");
                break;

            case 7:
                System.out.println("В Июле 31 дней");
                break;

            case 8:
                System.out.println("В Августе 31 дней");
                break;

            case 9:
                System.out.println("В Сентябре 30 дней");
                break;

            case 10:
                System.out.println("В Окрябре 31 дней");
                break;

            case 11:
                System.out.println("В Ноябре 30 дней");
                break;

            case 12:
                System.out.println("В Декабре 31 дней");
                break;
            default:
                System.out.println("Нет такого месяца:(");
        }
    }

    static String isOneB(String[] args) {

        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("высокосный")) {
                return "В Феврале 29 дней";
            }

        }
        return "В Феврале 28 дней";

    }

    public static void isTwo(int Mast, int number) {

        if (Mast <= 4 && Mast >= 0) {
            switch (Mast) {

                case 1:
                    System.out.print("Пики");
                    break;
                case 2:
                    System.out.print("Трефы");
                    break;
                case 3:
                    System.out.print("Бубны");
                    break;
                case 4:
                    System.out.print("Червы");
                    break;

            }
        } else {
            System.err.println("У нас всего четыре масти");
        }

        if (number >= 6 && number <= 14) {
            switch (number) {
                case 6:
                    System.out.print(" шестерка");
                    break;
                case 7:
                    System.out.print(" семерка");
                    break;
                case 8:
                    System.out.print(" восьмерка");
                    break;
                case 9:
                    System.out.print(" девятка");
                    break;
                case 10:
                    System.out.print(" десяточка");
                    break;
                case 11:
                    System.out.print(" валет");
                    break;
                case 12:
                    System.out.print(" дама");
                    break;
                case 13:
                    System.out.print(" король");
                    break;
                case 14:
                    System.out.print(" туз");
                    break;
            }

        } else if (number < 6) {
            System.err.println(" Достоинства карт начинаются от 6");

        } else if (number > 14) {
            System.err.println(" Достоинства карт не могут былть больше 14");
        }
    }

    /*
    Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
а) понедельник;
б) i-й день недели (если 1 января — понедельник, то d=1 , если вторник — d=2, ..., если воскресенье —  d= 7).

     */
    public static void isThree (){
        int daysOfYear = 365;
        int day=10;//определяем день недели
        int januaryOne=6;//является k-й день невисокосного года, в котором 1 января:
        int result = (day%7+januaryOne)%7-1;
        //  result = (result % 7);

        switch (result) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 0:
                System.out.println("Воскресенье");
                break;

        }
        System.out.println(result);
    }
    /*
     Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом будет строка “one”.

     */

    public static void isFour(int number) {

        String str = Integer.toString(number);
        str = "one";
        switch (number) {
            case 1:
                System.out.print(" One");
                break;
            case 2:
                System.out.print(" Two");
                break;
            case 3:
                System.out.print(" Three");
                break;
            case 4:
                System.out.print(" Four");
                break;
            case 5:
                System.out.print(" Five");
                break;
            case 6:
                System.out.print(" Six");
                break;
            case 7:
                System.out.print(" Seven");
                break;
            case 8:
                System.out.print(" eight");
                break;
            case 9:
                System.out.print(" nine");
                break;
            case 10:
                System.out.print(" ten");
                break;
            default:
                System.out.println("Условие: числа от 1 до 10");
        }
    }
    //Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.

    public static void isFive() {
        String x = new String();
        x = "pUlleveL";
        String e = new StringBuffer(x).reverse().toString();
        System.out.println(e);
    }
/*Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать условию (пример - emailaddr@domain.zone)
1)	emailaddr > 4 символов
2)	1 < domain < 10
3)	2 <= zone < 5
 При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.
*/

    public static void isSix(String email) {
        String emailn1 = email.toLowerCase();


        String test4 = emailn1.substring(0, emailn1.indexOf("@"));
        String test5 = emailn1.substring(emailn1.indexOf("@"), emailn1.indexOf("."));
        String test6 = emailn1.substring(emailn1.indexOf("."));

        int valid22 = test4.length();
        int valid23 = test5.length();
        int valid24 = test6.length();


        if ((valid22 > 4) && (2 <= valid23 && valid23 < 20) && (2 <= valid24 && valid24 < 5)) {
            System.out.println("Имя логина почты валидно");
        } else if (valid22 < 4) {
            System.err.println("Имя пользователя не валидно, указано слишком мало букв");
        } else if (1 >= valid23) {
            System.err.println("В имене домена должно быть от 2 до 20 букв");
        } else if (valid23 > 20) {
            System.err.println("В имене домена должно быть от 2 до 20 букв");
        } else if (2 > valid24) {
            System.err.println("Не правильный код страны");
        } else if (valid24 > 5) {
            System.err.println("Не правильный код страны");
        }

    }

    /* Дан массив строк. Написать программу, которая:
 а) выводит на экран значение всех строк через запятую, длина которых больше n.
 б) выводит на экран значение всех неповторяющихся строк через запятую.
 */
    public static void isSeven() {
        String[] auto = {"Волга", "Чайка", "Жигули"}; //задан массив строк
        // String result = "В гараже стоят машины: "; //задана строка

        int x;
//прибавляем к строке элементы массива
        for (int i = 0; i < auto.length; i++) {
            x = auto[i].length();
            if (x > 2) {
                //если элемент не последний, разделяем запятой
                if (i != auto.length - 1)
                    auto[i] += ", ";
                    //если последний, ставим после него точку
                else
                    auto[i] += ".";
                if (auto.length >= 2) {
                }

                System.out.print(auto[i]);

            }

        }
    }

    public static void isSevenB() {
        String[] auto = {"Волга", "Волга", "Чайка", "Чайка", "Жигули"};
        int x;
        System.out.print(auto[0]);
        for (int i = 1; i < auto.length; i++) {
            x = 0;
            for (int j = 0; j < i; j++) {
                if (auto[i].equals(auto[j])) x = 1;
                //auto[i] = auto[i] + i;
                //System.out.println(auto[i]);
            }
            if (x == 0) {
                System.out.print(", ");
                System.out.print(auto[i]);

            }
        }
    }
}




