package solutions.practice2.Employee04_02Soln.com.example.domain;

public class Engineer extends Employee {

    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }

    public void engineerMethod() {
        System.out.println("Method specific to Engineer class");
    }
}