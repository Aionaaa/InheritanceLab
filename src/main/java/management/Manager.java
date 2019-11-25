package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, int salary, String deptName){
        super(name, niNumber, salary);
    }


    public String getDeptName() {
        return deptName;
    }
}
