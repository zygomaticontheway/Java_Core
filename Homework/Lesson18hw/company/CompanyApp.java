package Lesson18hw.company;

public class CompanyApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the company " + Company.companyName);

        CompanyService service = new CompanyService();

        Department[] departments = service.addDepartments();
        Employee[] employees = service.addEmployees(departments);

        service.printInfo(departments, employees);

    }
}
