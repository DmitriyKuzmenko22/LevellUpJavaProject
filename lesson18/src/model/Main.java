package model;

public class Main {
    public static void main(String[] args) {

        Employee[]employees={new Jumioe(),new Middle(),new Senior()};

        for (Employee emp: employees){
            emp.calculateSalary();
        }
    }
}
