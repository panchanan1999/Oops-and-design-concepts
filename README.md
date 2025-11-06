# Employee Payroll System

A simple Java console application demonstrating Object-Oriented Programming (OOP) and basic system design concepts as a Low-Level Design (LLD) project.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [How to Run](#how-to-run)
- [Class Overview](#class-overview)
- [Usage Example](#usage-example)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

***

## Project Structure

```
src/EmployeePayroll/
  ├── Employee.java
  ├── EmployeePayroll.java
  ├── FullTimeEmployee.java
  ├── PartTimeEmployee.java
  └── MainClass.java
.gitignore
EmployeePayrollSystem.iml
README.md
```

***

## Features

- Add full-time and part-time employees to the system.
- Store employee data (ID, name, salary) in an in-memory list.
- Display all employee details with type-specific information.
- Demonstrates inheritance, encapsulation, and polymorphism.
- Console-based user input using Scanner class.
- Dynamic employee type identification and display.

***

## How to Run

1. Clone the repository:
   ```sh
   git clone https://github.com/panchanan1999/Oops-and-design-concepts.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Oops-and-design-concepts
   ```
3. Open the project in your preferred IDE (IntelliJ/Eclipse/VS Code).
4. Run `MainClass.java` from `src/EmployeePayroll/`.

***

## Class Overview

### Employee (Base Class)
Base class with common attributes:
- `id`: Employee ID
- `name`: Employee name
- `salary`: Employee salary
- `display()`: Method to display employee details

### FullTimeEmployee
Inherits from `Employee` class. Represents full-time employees with fixed salary structure.

### PartTimeEmployee
Inherits from `Employee` class. Represents part-time employees (extend functionality as needed).

### EmployeePayroll
Manages the employee payroll system:
- Maintains an `ArrayList<Employee>` to store all employees
- `addEmployee(Employee emp)`: Adds an employee to the list
- `displayAll()`: Displays all employees with type-specific labels

### MainClass
Main program that:
- Takes user input for number of employees
- Collects employee details (ID, name, salary) using Scanner
- Creates employee objects and adds them to the payroll
- Displays all employee information

***

## Usage Example

```
Enter number of employees: 2

Enter details for employee 1:
ID: 101
Name: Alice Johnson
Salary: 50000

Enter details for employee 2:
ID: 102
Name: Bob Smith
Salary: 60000

All Employee Details:
FullTimeEmployeeDetails:
ID: 101, Name: Alice Johnson, Salary: 50000.0
FullTimeEmployeeDetails:
ID: 102, Name: Bob Smith, Salary: 60000.0
```

***

## Technologies Used

- **Language**: Java
- **JDK Version**: 1.8+
- **Build Tool**: Maven (optional)
- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Version Control**: Git & GitHub

***

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or add.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

***

## License

This project is open source and available under the [MIT License](LICENSE).

***

## Author

**Panchanan Mandal**
- GitHub: [@panchanan1999](https://github.com/panchanan1999)

***

*Feel free to update this documentation as your project evolves!*
