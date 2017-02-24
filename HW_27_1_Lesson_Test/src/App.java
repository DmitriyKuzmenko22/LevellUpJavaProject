import java.util.Scanner;

/**
 * Created by Дмитрий on 22.02.2017.
 */
public class App {

    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if(line.equalsIgnoreCase("exit")) break;


            if (line.startsWith("add")) {
                company.addEmployee(line.split(" "));
            }
        }

    }
}
