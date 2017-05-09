package hiber;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by java on 31.03.2017.
 */

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@ToString
@SecondaryTable(name = "EMPLOYEE_DETAILS",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "ID_EMPLOYEE"))
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_first")
    private String firstName;

    @Column(name = "name_last")
    private String lastName;

    @Column(name = "name_second")
    private String secondName;

    @Column
    private double salary;

    @Type(type = "timestamp")
    @Column(name = "date_create")
    private Date creationDate = new Date();

    //@OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
    //private PhoneNumber phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="phone_id")
    private PhoneNumber phoneNumber;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "department_id", nullable = false)
   private Department department;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id", nullable = false)
    private Posts post;//class Posts

    @Column(table = "EMPLOYEE_DETAILS")
    @Enumerated(EnumType.STRING)// хранить в виде строки
    private Sex sex=Sex.UNKNOWN;

    @Column(table = "EMPLOYEE_DETAILS")
    private String city;

    @Column(table = "EMPLOYEE_DETAILS")
    private String streetName;

    @Column(table = "EMPLOYEE_DETAILS")
    private String zipCode;

    @Embedded
    private Car car;


    public Employee(String firstName, String lastName, String secondName, double salary,Department department, Posts post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.salary = salary;
        this.department=department;
        this.post=post;

    }

    public Employee() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Posts getPost() {
        return post;
    }

    public void setPost(Posts post) {
        this.post = post;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
