/**
 * Created by Дмитрий on 29.03.2017.
 */
public class Citizen extends Entity {

    private String first_Name;
    private String last_Name;
    private int age;

    public Citizen(int id, String first_Name, String last_Name, int age) {
        super(id);
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.age = age;
    }
    public Citizen(String first_Name, String last_Name, int age) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.age = age;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
