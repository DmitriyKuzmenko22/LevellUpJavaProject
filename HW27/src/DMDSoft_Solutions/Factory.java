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

    public void get(String...params){
       // String ignore = nameDepartsmensConsole.toUpperCase();
        if (!departaments.containsKey(params[1])){
            System.out.println(params[1]+" "+"the Department does not exist");
            return;
        }
       /* if (!departaments.get(params[1]).getEmployeeHashMap().containsKey(Integer.parseInt(params[2]))){
            System.out.println(params[1]+" "+"the employee does not exist!!!");
            return;
        }*/
        System.out.println(departaments.get(params[1]).getEmployeeHashMap().get(Integer.parseInt(params[2])).toString());
    }
    public void getis(String... params){
       // String ignore = nameDepartsmensConsole.toUpperCase();
        if (!departaments.containsKey(params[1])) {
            System.out.println(params[1] + " " + "the Department does not exist");
            return;
        }
        else {
            System.out.println(departaments.get(params[1]).toString());
        }
    }

    public void add(String... params){
       // String ignore = nameDepartsmensConsole.toUpperCase();
       // String departmentName = params[1];
        if (!departaments.containsKey( params[1])){
            System.out.println(params[1]+" "+"the Department does not exist!!!!!!!!!!1!");
            return;
        }
        if (departaments.get( params[1]).getCurrentEmployee()>=departaments.get( params[1]).getMaxEmployee()){
            System.out.println(  params[1] +" "+"unfortunately, this Department is filled");
            return;
        }
        Employee employee;
        switch (params[1]){
            case "MANAGMENT": employee=new Manager(Integer.parseInt(params[2]), params[3], params[4], Integer.parseInt(params[5])); break;
            case "DEVELOPER": employee=new Developer(Integer.parseInt(params[2]), params[3], params[4], Integer.parseInt(params[5])); break;
            case "DESINGER": employee=new Designer(Integer.parseInt(params[2]), params[3], params[4], Integer.parseInt(params[5])); break;
            default: employee=null;
                System.out.println("bad employee");
        }

        departaments.get(params[1]).add(Integer.parseInt(params[2]), employee);
            System.out.println(employee.getFirstName()+" added to "+params[1]+" department");

    }

    }


