package DMDSoft_Solutions;

import java.util.HashMap;

/**
 * Created by Дмитрий on 19.02.2017.
 */
public class Factory {

    private HashMap<String, Departaments> departaments;
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
        departaments=new HashMap<>();
        departaments.put("DESINGER",new Departaments("DESINGER",2));
        departaments.put("MANAGMENT", new Departaments("MANAGMENT",3));
        departaments.put("DEVELOPER",new Departaments("DEVELOPER",12));

    }
    public void getAll(){
        System.out.println(departaments.keySet().toString());
    }

    public void get(String nameDepartsmensConsole,Integer employeeConsole){
        String ignore = nameDepartsmensConsole.toUpperCase();
        if (!departaments.containsKey(ignore)){
            System.out.println(ignore+" "+"the Department does not exist");
            return;
        }
        if (!departaments.get(ignore).getEmployeeHashMap().containsKey(employeeConsole)){
            System.out.println(ignore+" "+"the employee does not exist!!!");
            return;
        }
        System.out.println(departaments.get(ignore).getEmployeeHashMap().get(employeeConsole).toString());
    }
    public void getis(String nameDepartsmensConsole){
        String ignore = nameDepartsmensConsole.toUpperCase();
        if (!departaments.containsKey(ignore)) {
            System.out.println(ignore + " " + "the Department does not exist");
            return;
        }
        else {
            System.out.println(departaments.get(ignore).toString());
        }
    }

    public void add(String nameDepartsmensConsole,Integer employeeConsoleID, String firsName, String lastName, Integer salary ){
        String ignore = nameDepartsmensConsole.toUpperCase();
        if (!departaments.containsKey(ignore)){
            System.out.println(ignore+" "+"the Department does not exist!!!!!!!!!!!");
            return;
        }
        if (departaments.get(ignore).getCurrentEmployee()>=departaments.get(ignore).getMaxEmployee()){
            System.out.println(ignore+" "+"unfortunately, this Department is filled");
            return;
        }
        Employee employee;
        switch (ignore){
            case "MANAGMENT": employee=new Manager(employeeConsoleID,firsName,lastName,salary); break;
            case "DEVELOPER": employee=new Developer(employeeConsoleID,firsName,lastName,salary); break;
            case "DESINGER": employee=new Designer(employeeConsoleID,firsName,lastName,salary); break;
            default: employee=null;
                System.out.println("bad employee");
        }

        departaments.get(ignore).add(employeeConsoleID, employee);
            System.out.println(employee.getFirstName()+" added to "+nameDepartsmensConsole+" department");

    }

    }


