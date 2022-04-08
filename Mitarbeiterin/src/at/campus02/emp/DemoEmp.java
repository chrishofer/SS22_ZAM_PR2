package at.campus02.emp;

import java.util.Arrays;

public class DemoEmp {
    public static void main(String[] args) {
        int tag1 = 12; // das ist eine lokale variable

        Employee e1 = new Employee(1, "Hansi", 10000.0, "Musik");
        Employee e2 = new Employee(2, "Susi", 5000, "Marketing");
        Employee e3 = new Employee(3, "Anton", 3000, "Musik");

        EmployeeManager mgr = new EmployeeManager();
        mgr.addEmployee(e1);
        mgr.addEmployee(e2);
        mgr.addEmployee(e3);

        System.out.println(mgr.findByEmpNumber(3));
        System.out.println(mgr.findByDepartment("Musik"));
        System.out.println(mgr.findByMaxSalary());

        // Vergleichen ob e1 und e3 in gleicher abeiltung arbeiten
        System.out.println(e1.compareDepartment(e3));
        System.out.println(e1.compareDepartment(e2));
    }
}
