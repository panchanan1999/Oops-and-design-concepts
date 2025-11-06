package EmployeePayroll;

import java.util.ArrayList;

public class EmployeePayroll {
    private ArrayList<Employee>employeelist;
    public EmployeePayroll()
    {
        employeelist=new ArrayList<>();
    }
    public void AddEmployee(Employee emp)
    {
        employeelist.add(emp);
    }
    public void deleteemployee(int id)
    {
        Employee employeetoberemove=null;
        for(Employee emp:employeelist)
        {
            if(emp.getId()==id)
            {
                employeetoberemove=emp;
                break;
            }
        }
        if(employeetoberemove!=null)
        {
            employeelist.remove(employeetoberemove);
        }
    }
    public void displayemployee(){
        for (Employee emp : employeelist) {
            if (emp instanceof FullTimeEmployee) {
                System.out.println("FullTimeEmployeeDetails: "+ emp);
            } else if (emp instanceof PartTimeEmployee) {
                System.out.println("PartTimeEmployeeDetails: "+emp);
            } else {
                System.out.println("OtherEmployeeDetails:");

            }
        }

    }
}
