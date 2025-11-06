package EmployeePayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args)
    {
        EmployeePayroll emp=new EmployeePayroll();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of FullTime employee present in the organization: ");
        int f=sc.nextInt();
        for (int i = 0; i < f; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            // Create FullTimeEmployee and add to payroll
            FullTimeEmployee emp1 = new FullTimeEmployee(id, name, salary);
            emp.AddEmployee(emp1);
        }
        System.out.println("Enter the number of PartTime employee present in the organization: ");
        int p=sc.nextInt();
        for(int i=0;i<p;i++)
        {
            System.out.println("\n Enter the details of the parttime employee " +(i+1)+" :");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("No of hours worked: ");
            double no_ofHours = sc.nextDouble();
            sc.nextLine();
            System.out.print("charge of hours worked: ");
            double charged = sc.nextDouble();
            sc.nextLine();
            PartTimeEmployee emp2=new PartTimeEmployee(id,name,no_ofHours,charged);
            emp.AddEmployee(emp2);

        }
        System.out.println("the total number of employee present in the organization: "+(p+f));


        //FullTimeEmployee emp1=new FullTimeEmployee(9,"pitel",90000.0);
        //PartTimeEmployee emp2=new PartTimeEmployee(8,"parth",9,900);
        //emp.AddEmployee(emp1);
        //emp.AddEmployee(emp2);
        emp.displayemployee();

        sc.close();

    }
}
