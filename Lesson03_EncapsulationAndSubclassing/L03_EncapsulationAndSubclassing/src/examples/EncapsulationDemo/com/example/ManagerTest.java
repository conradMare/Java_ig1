package examples.EncapsulationDemo.com.example;

public class ManagerTest {

    public static void main(String args[]) {
        Manager mgr = new Manager("admin", 151, "Tom", "gh123", 8000);

        System.out.println("Details of Manager");
        String name = mgr.getName();
        String ssn = mgr.getSsn();
        double salary = mgr.getSalary();
        int id = mgr.getEmpId();
        String dept = mgr.getDeptName();
        System.out.println("Name= " + name + " " + "ssn= " + ssn + " " + "salary= " + salary
                + " " + "id " + id + "Dept " + " " + dept);
    }
}
