public class Main {
    static int a = 10;

    public static void main(String[] args) {

        int score = 3;
        isEvent(a, 14);
        isWorldChampion(0);
        WhichGreat(44);
        isBiggest(14, 45);
        isBiggest1(666888);
        int x=666888%1000;
        int d=666888/1000;
        System.out.println(x+" "+d);
    }

    public static void isEvent(int a, int b) {
        if (a == 9 && b == 14) {
            System.out.println("Программист празднует свой профессиональній праздник");
        } else {
            System.out.println("Работает как раб в африке во время колониального режима");
        }
    }

    public static void isWorldChampion(int score) {
        String result = null;
        if (score == 3) {
            System.out.println("Pobeda");
        } else if (score == 1) {
            System.out.println("Ничья");
        } else if (score == 0)
            System.out.println("Поражение");
        else

        {
            System.out.println("error");
        }

    }

    public static void WhichGreat(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first < second) {
            System.out.println("Первая меньше");
        } else {
            System.out.println("Первая больше");
        }
        if (first == second) {
            System.out.println("одинаковы");
        } else {
            System.out.println("не одинаковы");
        }
    }

    public static void isBiggest(int number, int number2) {
        if (number > number2) {
            System.out.println("Первое больше");
        } else {
            System.out.println("Второе больше");
        }

    }

    public static void isBiggest1(int number) {
        int a=number%100000;
        int b=(number/10000)%10;
        int c=(number/1000)%10;
        int d=(number/100)%10;
        int e=(number/10)%10;
        int f=(number/1)%10;
        if ((a+b+c)==(d+e+f)) {
            System.out.println("счастливое");
        } else {
            System.out.println("не счастливое");{

            }
        }
    }
}

