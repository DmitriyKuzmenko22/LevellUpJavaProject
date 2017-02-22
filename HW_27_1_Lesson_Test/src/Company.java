import java.util.HashMap;
import java.util.Map;


public class Company {

    private Map<String, Department<? extends Employee>> map = new HashMap<>();

    public Company() {
        Department<Developer> developerDepartment = new Department<>("development");
        map.put(developerDepartment.getName(), developerDepartment);

        Department<Manager> managerDepartment = new Department<>("management");
        map.put(managerDepartment.getName(), managerDepartment);
    }


    public void addEmployee(String... params) {
        String departmentName = params[1];

        Department<? extends Employee> department = map.get(departmentName);

        Employee employee = createEmployee(params);
    }

    private Employee createEmployee(String[] params) {
        switch (params[1]) {
            case "development" : {
                return new Developer();
            }
            //write your code here
        }
        return null;
    }
}