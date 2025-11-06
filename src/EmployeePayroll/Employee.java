package EmployeePayroll;

abstract public class Employee {
    private int id;
    private String name;
    public Employee (int id,String name) {
        this.id=id;
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    abstract double calculatesalary();
    @Override
    public String toString()
    {
        return "Employee details: name="+name+", id=" +id+", Salary=" + calculatesalary();
    }

}
