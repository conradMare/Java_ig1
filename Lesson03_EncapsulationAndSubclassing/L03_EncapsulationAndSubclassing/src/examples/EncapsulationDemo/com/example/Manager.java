package examples.EncapsulationDemo.com.example;

public class Manager extends Employee3 {

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String department) {
        super(empId, name, ssn, salary, department);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }
}
