package patterns.creational.Prototype;

import java.util.HashMap;

public class Employees implements Cloneable {

        public static void main(String[] args) throws CloneNotSupportedException{
            Employees employees = new Employees();
            Employees employeesClone = (Employees) employees.clone();

            System.out.println(employees.allEmployees == employeesClone.allEmployees);
        }

    private HashMap<String, String> allEmployees;

    public Employees(){
        allEmployees = new HashMap<>();
        loadAllEmployeeData();
    }

    public Employees(HashMap<String, String> allEmployees){
        this.allEmployees = allEmployees;
    }

    public void addEmployee(String name, String jobTitle){
        allEmployees.put(name, jobTitle);
    }

    public void listAllEmployees(){
        System.out.println(allEmployees);
    }

    // Loads employees from "database"
    private void loadAllEmployeeData(){
        allEmployees.put("james", "Chief Technical Officer");
        allEmployees.put("sarah", "Back-End Developer");
        allEmployees.put("Michael", "Front-End Developer");
    }

    // Clones object
    @Override
    public Object clone() {
        Employees clone;
        clone = new Employees(allEmployees);
        try{
            clone = (Employees) super.clone();
        } catch(CloneNotSupportedException e){
            clone = new Employees(allEmployees);
        }
        return clone;
    }
}
