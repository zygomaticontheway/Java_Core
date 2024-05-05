package Lesson18hw.company;

import java.util.Arrays;

public class CompanyService {

    UserInput ui = new UserInput();

    public Department[] addDepartments (){

        int amountOfDepartments = ui.inputInt('\n' + "Enter amount of Departments, you want to create:");

        Department[] departmentsList = new Department[amountOfDepartments];

        for (int i = 0; i < amountOfDepartments; i++) {
            departmentsList [i] = createDepartment();
        }
        System.out.println("Departments had been added to company " + Company.companyName);
        System.out.println("Total amount of departments is: " + departmentsList.length + '\n');

        return departmentsList;
    }

    public Department createDepartment(){
        String departmentName = ui.inputText("Enter Department name:");
        Department newDepartment = new Department(departmentName);

        return newDepartment;
    }

    public Employee createEmployee(Department[] departmentsList){

        String employeeName = ui.inputText('\n' + "Enter Employee's full name:");

        int employeeAge = ui.inputInt("Enter Employee's age:");

        System.out.println("____________" + '\n' + "Departments list:");

        for (int i = 0; i < departmentsList.length; i++) {

            System.out.println(i + " " + departmentsList[i].getDepartmentName());

        }
        System.out.println("____________");

        int departmentIndex = ui.inputInt("Enter department number from the list (above):");
        String department = departmentsList[departmentIndex].getDepartmentName();

//        String departmentsHeadValue = ui.inputText("Is this Employee a head of department? Enter 'y' if yes, or 'n' if no:");
//        boolean isDepartmentHead = departmentsHeadValue.toLowerCase() == "y" ? true : false;
//
//        String directorValue = ui.inputText("Is this Employee a Director? Enter 'y' if yes, or 'n' if no:");
//        boolean isDirector = directorValue.toLowerCase() == "y" ? true : false;

//        Employee newEmployee = new Employee(employeeName, employeeAge, department, isDepartmentHead, isDirector);
        Employee newEmployee = new Employee(employeeName, employeeAge, department);
        System.out.println("~~~~~~");

        return newEmployee;
    }
    public Employee[] addEmployees (Department[] departmentsList){

        int amountOfEmployees = ui.inputInt("Enter amount of Employees, you want to add:");

        Employee[] employeesList = new Employee[amountOfEmployees];

        for (int i = 0; i < amountOfEmployees; i++) {
            employeesList [i] = createEmployee(departmentsList);
        }
        System.out.println("Employees had been added to company " + Company.companyName);
        System.out.println("Total amount of Employees is: " + employeesList.length + '\n');

        return employeesList;
    }

    public void printInfo (Department[] departments, Employee[] employeesList){
        System.out.println("____________" + '\n');
        System.out.println("Company: " + Company.companyName);
        System.out.println('\n' + "Employees:");

        for (int i = 0; i < employeesList.length; i++) {
            System.out.println("Department: " + employeesList[i].getDepartment());
            System.out.println("Name: " + employeesList[i].getEmployeeName());
            System.out.println("Age: " + employeesList[i].getEmployeeAge());
//            System.out.println("Is a Head of department: " + employeesList[i].isDirector());
//            System.out.println("Is a Director: " + employeesList[i].isDirector());
            System.out.println();
        }
    }


}
