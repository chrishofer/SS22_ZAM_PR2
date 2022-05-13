package at.campus02.iwi;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    protected ArrayList<Employee> empList;
    public EmployeeManager() {
        empList = new ArrayList<Employee>();
    }
    public double calcTotalSalary()
    {
        double total = 0;
        for(Employee e : empList)
        {
            total += e.getFullSalary();
        }
        return total;
    }
    public void addEmployee(Employee e)
    {
        empList.add(e);
    }
    public HashMap<String, Double> getSalaryByDepartment()
    {
        HashMap<String, Double> dept = new HashMap<String, Double>();

        for(Employee e : empList)
        {
            if(dept.containsKey(e.department))
            {
                // already present
                double help = dept.get(e.department);
                dept.put(e.department, help + e.getFullSalary());
            }
            else
            {
                // new key
                dept.put(e.department, e.getFullSalary());
            }
        }

        return dept;
    }
}