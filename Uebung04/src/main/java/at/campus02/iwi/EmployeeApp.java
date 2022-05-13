package at.campus02.iwi;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeManager empManager = new EmployeeManager();

        empManager.addEmployee(new FixCommissionEmployee("huber", "manfred", "it", 1000, 200));
        empManager.addEmployee(new PercentComissionEmployee("scheuber", "miriam", "marketing", 1000, 30));
        empManager.addEmployee(new Employee("lechner", "toni", "gf", 1100));
        empManager.addEmployee(new FixCommissionEmployee("huber", "hans", "it", 1000, 200));

        System.out.println(empManager.calcTotalSalary());
        System.out.println(empManager.getSalaryByDepartment());

    }

}
