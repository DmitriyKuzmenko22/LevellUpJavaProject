/**
 * Created by Dmitriy on 01.12.2016.
 */
public class HW8 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr = {2, 6, 9, 10, 15, 20, 50, 79, 21};
        int num = 55994999;
        // isOne(arr);
        // isTwo(arr);
        //isThree();
        // isFour();
        // isFive();
        //isSix();
        //isSeven(num);
        //ieght(8732);
       // nine(2,4);
        ten();


    }

    public static void isOne(int arr[]) {
        int x = 0;
        int y = 0;
        for (int elem : arr) {

            if (elem > 10) {
                x += elem;
                y = y + 1;

            }
        }
        System.out.println(x / y);
    }

    //Найти среднее арифметическое элементов массива, меньших некоторого числа m. * Решить задачу при помощи циклов while и for-each
    public static void isTwo(int arr[]) {

        double x = 0;
        double y = 0;
        double m = 15;
        for (int elem : arr) {

            if (elem < m) {
                x += elem;
                y = y + 1;

            }
        }
        System.out.println(x / y);
    }

    /*В массиве из 20 элементов числа образуют неубывающую последовательность. Несколько элементов, идущих подряд, равны между собой. Найти количество таких элементов.
Сколько различных чисел имеется в массиве? */
    public static void isThree() {
        int[] arr2 = {1, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 11, 12, 12, 13, 14, 15, 18};
        int zz = -1;
        int xx = 1;
        for (int elem : arr2) {
            if (arr2[elem] == (arr2[elem - 1])) {
                zz += 1;

            }

            if (arr2[elem] != arr2[elem - 1]) {
                xx += 1;
                //xx=xx-zz;
            }
        }
        System.out.println(zz);
        System.out.println(xx - zz);

    }

    /*В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилей. Определить скорости двух самых быстрых автомобилей. * Задачу решить, не используя два прохода по массиву.*/
    public static void isFour() {
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 92, 23, 24, 25, 28, 27, 28, 29, 30, 31, 38, 333, 34, 35, 36, 37, 68, 39, 49};
        int max = 0;
        int max2 = 0;
        for (int elem : arr4) {

            while (elem > max) {
                max = elem;

            }
            while (elem > max2 & elem < max) max2 = elem;
        }
        System.out.println(max);
        System.out.println(max2);
    }

    /*Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    а) сумму всех чисел последовательности;
    б) количество всех чисел последовательности.
    */
    public static void isFive() {
        int[] arr5 = {10, 20, 30, 40, 50, 60};
        int x = 0;
        int k = 0;
        for (int elem : arr5) {
            x += elem;
            k += 1;
        }
        System.out.println(x);
        System.out.println(k);
    }

    /*Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа. Определить, какое количество
    отрицательных чисел записано в начале последовательности. Условный оператор не использовать.*/
    public static void isSix() {
        double[] arr6 = {-2, -54, -1.2, 0, 1, 2, 5.5, 8.4};
        int x = 0;


        while (x < arr6.length && arr6[x] < 0) {
            x++;

        }
        System.out.println(x);
    }

    /*Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра
    (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1).
    * Задачу решить, не используя два прохода по массиву.
     */
    public static void isSeven(int x) {
        int kol = 0;
        int max = 0;
        do {
            if (x % 10 > max) {//9 9
                max = x % 10;//9 9
                kol = 1;//1 1
            } else if (x % 10 == max) {
                kol++;
            }
            x /= 10;
        } while (x > 0);
        System.out.println(kol);
    }
/*Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.*/
public static void ieght(int num) {
    int mirror = 0;//8732
    while (num != 0) {
        mirror = mirror * 10 + (num % 10);
        num = num / 10; //87
    }

    System.out.println(mirror);
}

    /*Дано двузначное число. Необходимо написать программу, которая вернет строковое представление данного числа. Например, дано число 34, его строковое представление - thirty four.*/

        public static void nine(int a, int b) {

            switch (a) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }

        }
        /*Написать программу определения оценки студента по его рейтингу, на основе следующих правил:*/

    public static void ten(){
            int a=4;
        if (a > 0 && a < 19) {
            System.out.println("Оценка ученика - F");
        }
        else if (a>=20&&a<=39){
            System.out.println("Оценка ученика - E");
        }
        else if (a>=40&&a<=59){
            System.out.println("Оценка ученика - D");
        }
        else if (a>=60&&a<=74){
            System.out.println("Оценка ученика - C");
        }
        else if (a>=75&&a<=89){
            System.out.println("Оценка ученика - D");
        }
        else if (a>=90&&a<=100){
            System.out.println("Оценка ученика - A");
        }
        else {
            System.out.println("Вы ввели не правильную оценку :(");
        }
    }


}









