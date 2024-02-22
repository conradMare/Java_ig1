package practices.practice2.Employee04_02Prac.com.example.domain;

import practices.practice1.Employee04_01Prac.com.example.domain.Manager;

public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String department, double budget) {
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}