package solutions.practice1.Employee03_01Soln.com.example.domain;

import examples.EncapsulationDemo.com.example.Manager;

public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String department, double budget) {
        super(empId, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void printEmployee() {
    }
}