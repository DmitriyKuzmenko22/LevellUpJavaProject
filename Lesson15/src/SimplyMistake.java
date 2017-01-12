public class SimplyMistake{
    public static void main(String args[]) {
        String szShortString="123";
//        char chr = szShortString.charAt(10);

        try {
//            String szShortString="123";
            char chr = szShortString.charAt(0);
            System.out.println(chr);
        } catch (Exception e) {
            System.out.println("нет такого символа");

        }

    }
}
