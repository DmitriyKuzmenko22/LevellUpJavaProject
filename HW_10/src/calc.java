
public class calc {
    public static int sum(int a, int b) {
        return a + b;
    }
//
    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String a, String b) {

        return Integer.parseInt(a) + Integer.parseInt(b) + "";

    }

    public static int vich(int a, int b) {
        return a - b;
    }

    public static double vich(double a, double b) {
        return a - b;
    }

    public static String vich(String a, String b) {

        return Integer.parseInt(a) - Integer.parseInt(b) + "";
    }
    public static int umn(int a, int b) {
        return a * b;
    }

    public static double umn(double a, double b) {
        return a * b;
    }

    public static String umn(String a, String b) {

        return Integer.parseInt(a) * Integer.parseInt(b) + "";
    }
    public static int del(int a, int b) {
        return a / b;
    }

    public static double del(double a, double b) {
        return a / b;
    }

    public static String del(String a, String b) {

        return Integer.parseInt(a) / Integer.parseInt(b) + "";
    }
}