import java.util.Scanner;

public class lesson9 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Enter operat: ");

            String operator = scanner.next();
            System.out.print("Enter first operand: ");
            int a = scanner.nextInt();

            System.out.print("Enter second operand: ");
            int b = scanner.nextInt();

            switch (operator) {

                case "+":
                    System.out.print((a + operator + b) + "  " + calc.sum(a, b));
                    break;
            }
            System.out.print("would you like to cintinue? Enter y/n ");

            String exitWord = scanner.next();
            if(exitWord!=null&&!exitWord.isEmpty()&&!exitWord.equalsIgnoreCase("y")) break;
        }

    }
}
