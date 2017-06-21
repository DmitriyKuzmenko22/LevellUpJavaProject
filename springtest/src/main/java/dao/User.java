package dao;

/**
 * Created by java on 16.06.2017.
 */
public class User {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private double balance=100;
//
    public User() {
    }

    public User(Long id, String email, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public double increaseBalance(double inc){
        return balance+=inc;
    }

    public double decreaseBalance(double dec) throws Exception {
        if (balance-dec<0) throw  new Exception("negativ balanse");
        return balance-=dec;
    }



    @Override
    public String toString() {
        return "dao.User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
