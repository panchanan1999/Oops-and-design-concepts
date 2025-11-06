# Oops-and-design-concepts
Employee Payroll System
A simple Java console application demonstrating Object-Oriented Programming (OOP) and basic system design concepts as a Low-Level Design (LLD) project.

Table of Contents
Project Structure

Features

How to Run

Class Overview

Usage Example

Contributing

License

Project Structure
text
src/EmployeePayroll/
  ├── Employee.java
  ├── EmployeePayroll.java
  ├── FullTimeEmployee.java
  ├── PartTimeEmployee.java
  └── MainClass.java
.gitignore
EmployeePayrollSystem.iml
README.md
Features
Add full-time and part-time employees to the system.

Store employee data (ID, name, salary) in an in-memory list.

Display all employee details with type-specific information.

Demonstrates inheritance, encapsulation, and polymorphism.

How to Run
Clone the repository:

text
git clone https://github.com/<your-username>/Oops-and-design-concepts.git
Navigate to the project directory:

text
cd Oops-and-design-concepts
Open the project in your preferred IDE (IntelliJ/Eclipse/VS Code) and run MainClass.java from src/EmployeePayroll/.

Class Overview
Employee: Base class with id, name, and salary fields.

FullTimeEmployee: Inherits from Employee.

PartTimeEmployee: Inherits from Employee (extend functionality as needed).

EmployeePayroll: Maintains a list of all employees and provides methods to add and display them.

MainClass: Main program; takes user input to add employees and displays results.

Usage Example
text
Enter number of employees: 2

Enter details for employee 1:
ID: 1
Name: Alice
Salary: 50000

Enter details for employee 2:
ID: 2
Name: Bob
Salary: 60000

All Employee Details:
FullTimeEmployeeDetails:
ID: 1, Name: Alice, Salary: 50000.0
FullTimeEmployeeDetails:
ID: 2, Name: Bob, Salary: 60000.0
Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or add.
