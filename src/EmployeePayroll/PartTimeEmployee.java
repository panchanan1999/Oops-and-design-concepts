package EmployeePayroll;

public class PartTimeEmployee extends Employee {
    private double hoursworkedperday;
    private double chargedperhourwork;
    public PartTimeEmployee(int id,String name,double hoursworkedperday,double chargedperhourwork){
        super(id,name);
        this.hoursworkedperday=hoursworkedperday;
        this.chargedperhourwork=chargedperhourwork;
    }
    @Override
    public double calculatesalary()
    {
        double monthlysalary=hoursworkedperday*chargedperhourwork*30;
        return monthlysalary;
    }
}
