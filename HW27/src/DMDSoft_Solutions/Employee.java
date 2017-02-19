package DMDSoft_Solutions;

/**
 * Created by Дмитрий on 19.02.2017.
 */
public abstract class Employee {
    private int employeeId;
    private String firstName, lastName;
    private int salary;

    public Employee(int employeeId, String firstName, String lastName, int salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
