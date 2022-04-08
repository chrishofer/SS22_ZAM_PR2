package at.campus02.emp;

import java.util.Objects;

public class Employee {
    private int empNumber; // das ist ein attribut - gehoert zur klasse Employee
    private String name; // jede instanz oder objekt von employeee hat alle diese
    private double salary; // eigenschaften (alternativ auch attribute oder member genannt)
    private String department;



    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    // neue methode soll überprüfen ob zwei mitarbeiter*innen im gleichen department arbeiten
    // true zurückliefern falls ja, sonst false
    public boolean compareDepartment(Employee e){


        if(department.equals(e.department)){
            return true;
        }
        return false;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, department);
    }
}
