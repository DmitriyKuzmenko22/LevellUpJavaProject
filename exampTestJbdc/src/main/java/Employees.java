/**
 * Created by java on 21.03.2017.
 */
public class Employees {
    private int id;
    private String name_first;
    private String name_last;
    private String name_second;
    private int salary;
    private int department_id;
    private int post_id;
    private int date_create;

    public Employees(int id, String name_first, String name_last) {
        this.id = id;
        this.name_first = name_first;
        this.name_last = name_last;
    }
}
