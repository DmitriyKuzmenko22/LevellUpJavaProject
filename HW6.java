import java.lang.reflect.Array;

/**
 * Created by Dmitriy on 23.11.2016.
 */
public class HW6 {
    public static void main(String[] args) {
        System.out.println("Hello World");


        String symbol = "habrahabr";
        String str = "Днепр";
        int vklad = 1000;
        //  StringBuffer sb = new StringBuffer("Animal");
        //  isOne(symbol);
        // isTwo(str);
        //isThree();
        //  isFour(vklad);
        // isFive(5,5);
        //isSix(22.2,5.8);
        //isSeven(3, 3);
        //isSevenB(-3,-2);
        //iseight();
        //isNine(25.5f);
        // isTen();
       // isEleven();
        istwelve();


    }
//Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.

    public static void isOne(String symbol) {
        int kol = symbol.length();
        for (int i = 0; i <= symbol.length(); i++) {
            int x;
        }
        System.out.println(kol + "*");
        //System.out.println(length+1);
        //  StringBuffer sb = new StringBuffer("Animal");
        // System.out.println(sb.length());


    }
//дано название футбольного клуба. Напечатать его на экране "столбиком".

    public static void isTwo(String str) {
        int last1 = str.length() - 5;//длина строки - 1, так как отсчет начинается с 0
        int last2 = str.length() - 4;//длина строки - 1, так как отсчет начинается с 0
        int last3 = str.length() - 3;//длина строки - 1, так как отсчет начинается с 0
        int last4 = str.length() - 2;//длина строки - 1, так как отсчет начинается с 0
        int last5 = str.length() - 1;//длина строки - 1, так как отсчет начинается с 0
        char ch1 = str.charAt(last1);
        char ch2 = str.charAt(last2);
        char ch3 = str.charAt(last3);
        char ch4 = str.charAt(last4);
        char ch5 = str.charAt(last5);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
    }
   // Найти сумму положительных нечетных чисел, меньших 50.
    public static void isThree() {

        int[] arr = new int[51];
        // arr[0]=1;
        int sum = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            //int summ=arr[0]+arr[i];
            arr[i] = arr[i] + i;
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
//Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
   // а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
   // б) сумму вклада через: полгода, 2 года, 5 лет.

    public static void isFour(int vklad) {
        int summ = 1000 * 2 * 30 / 365 / 100;
        int nextMonth = 1;
        for (int i = 0; i < 12; i++) {
            nextMonth = summ + i;
        }
        int halfyear = 0;
        for (int n = 1, i = 1; i <= 3; i++) {
            halfyear = halfyear + i;
        }
        int Year = 0;
        for (int i = 0; i <= 12; i++) {
            Year = Year + i;
        }
        System.out.println("Сумма вклада за один месяц: " + summ);
        System.out.println("Ежемесячный прирост суммы вклада: " + vklad + +nextMonth);
        System.out.println("Пологудовой прирост суммы вклада: " + vklad + halfyear);
        System.out.println("Годовой прирост суммы вклада: " + Year);
    }
    //Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм. Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.

    public static void isFive(int c, int d) {
        int a = 55;
        int b = 35;
        if (a > c & b > d) {
            a = a - c;
            b = b - c;
            if (a > 1 & b > 1) {
                System.out.println("Конверт подходящий");
            }
        } else {
            System.out.println("Конверт не подходит");
        }
    }
//Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.

    public static void isSix(double c, double d) {
        if (c > d) {
            System.out.println("Число больше: " + c);
        }

    }

    //Записать условие, которое является истинным, когда:
    //  a) только одно из чисел А и В четное;
    //   б) хотя бы одно из чисел А и В положительно;
    public static void isSeven(int a, int b) {
        a = a % 2;
        b = b % 2;
        if (a == 0 | b == 0) {
            System.out.println("Оба числа четные");
        } else {
            System.out.println("Одно число или оба не четные");
        }
    }

    public static void isSevenB(int a, int b) {

        if (a >= 0 | b >= 0) {
            System.out.println("Хотя б одно из чисел больше 0");
        } else {
            System.out.println("Хотя б одно из чисел НЕ больше 0");
        }
    }

    //Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public static void iseight() {
        for (int n = 0, i = 0; i < 11; i++, n = i * 453) {
            System.out.println(n + " Грамм в " + i + " фунт");
        }
        for (int n = 0, i = 0; i < 11; i++, n = i * 1000) {
            System.out.println(n + " Грамм в " + i + " КГ");
        }
    }

    //Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
    public static void isNine(float kurs) {
        float x;
        for (int n = 0, i = 1; i < 20; i++) {
            x = i * kurs;

            System.out.println(x + " " + i);
        }

    }
    //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.

    public static void isTen() {
        int ameba = 1;
        for (int i = 1, n = 1; i <= 24; i = i + 3, n = (i / 3) * 2) {

            System.out.println(n);
        }

    }

    //В массиве записаны оценки по информатике 22 учеников класса. Определить количество учеников, оценка которых меньше средней оценки по классу, и вывести номера элементов массива,
    // соответствующих таким ученикам.
    public static void isEleven() {
        int[] isClass = new int[22];
        for (int i = 0; i < isClass.length; i++) {
            isClass[i] = ((int) (Math.random() * 100));
            System.out.println("Оценка ученика " + i + " " + isClass[i]);
        }
        int sum = 0;
        float sred = 22;

        for (int i = 0; i < isClass.length; i++) {
            sum = sum + isClass[i];

        }

        sred = sum / sred;
        System.out.println("Средняя оценка по классу " + sred);
        int minIndex = 0;
        for (int i = 0; i < isClass.length; i++) {
            if (isClass[i] < sred) {
                minIndex = i;
                System.out.println("Индекс учеников оценка которых меньше среднего " + minIndex);
//                if (isClass[i] < sred) {
//                    System.out.println(isClass[i]);

            }
        }

    }
    //Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.

    public static void istwelve() {
        int[] arr2 = new int[10];
        int kol=0;
        int kol2=0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ((int) (Math.random() * 15));
            System.out.println(arr2[i]);

            if((arr2[i]%2==0)){
kol++;
            }
if(arr2[i]%10==5){
    kol2++;
}
        }
        System.out.println("Количество "+kol);
        System.out.println("Количество элементов, оканчивающихся на цифру 5 :"+kol2);
    }
}







