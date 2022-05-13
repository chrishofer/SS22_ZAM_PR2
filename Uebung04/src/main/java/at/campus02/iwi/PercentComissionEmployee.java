package at.campus02.iwi;

public class PercentComissionEmployee extends Employee {
    protected double percentCommission;
    public PercentComissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }
    @Override
    public double getFullSalary() {
        return baseSalary * (1.0 + percentCommission / 100);
    }

}