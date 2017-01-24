public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Country c = new Country("Ukraine", 456);
        Country c2 = new Country("Ukraine", 456);
        System.out.println(c.equals(c2));
    }
}
