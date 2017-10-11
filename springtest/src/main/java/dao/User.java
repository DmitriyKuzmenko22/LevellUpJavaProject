package dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by java on 16.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    /*private Long id;*/
    private String name;
    @JsonProperty("atp.age")
    private int age;
    private List<String> messages;
   /* private String email;
    private String firstName;
    private String lastName;
    private double balance;*/
//
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", messages=" + messages +
                '}';
    }

    /*public User(Long id, String email, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

  /*  public Long getId() {
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
    }*/
}
