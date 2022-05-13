package at.campus02.iwi;

public class Employee {
    private String empNumber;
    private String name, department;
    private double salary;

    public Employee(String empNumber, String name, String department, double salary) {
        this.empNumber = empNumber;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
