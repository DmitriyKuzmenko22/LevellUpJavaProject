package DMDSoft_Solutions;

import java.util.HashMap;

/**
 * Created by Дмитрий on 19.02.2017.
 */
public class Departaments {
    private String nameDepartments;
    private HashMap<Integer,Employee> employeeHashMap;
    private int maxEmployee;
    private int currentEmployee;

    public Departaments(String nameDepartments, int maxEmployee) {
        employeeHashMap=new HashMap<>();
        this.nameDepartments = nameDepartments;
        this.maxEmployee = maxEmployee;
    }
    public boolean add (int employeeId, Employee employee){
        if (employeeHashMap.containsKey(employeeId)) {
            System.out.println("ID "+employeeId+" already exists");
            return false;
        }
        employeeHashMap.put(employeeId, employee);
        currentEmployee++;
        return true;
    }

    public String getNameDepartments() {
        return nameDepartments;
    }

    public HashMap<Integer, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    public int getMaxEmployee() {
        return maxEmployee;
    }

    public int getCurrentEmployee() {
        return currentEmployee;
    }

   /* @Override
    public String toString() {
        return "Departaments{" +
                "employeeHashMap=" + employeeHashMap +
                '}';
    }*/
    @Override
    public String toString() {
        return employeeHashMap.keySet().toString();
    }
}
