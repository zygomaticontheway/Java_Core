package Lesson18hw.company;

import java.util.Arrays;

public class Company {
    public static String companyName = "Coffee with cognac";
    private static String [] departments;
    private String [] employees;
    private int employeesAmount;
    private String director;

    public Company(String[] departments, String[] employees, int employeesAmount, String director) {
        this.departments = departments;
        this.employees = employees;
        this.employeesAmount = employeesAmount;
        this.director = director;
    }

    public Company(String[] departments) {
        this.departments = departments;
    }

    public Company(Department[] departmentsList) {
    }

    public String getCompanyName() {
        return companyName;
    }

    public static String[] getDepartments() {
        return departments;
    }

    public String[] getEmployees() {
        return employees;
    }

    public int getEmployeesAmount() {
        return employeesAmount;
    }

    public String getDirector() {
        return director;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public void setEmployeesAmount(int employeesAmount) {
        this.employeesAmount = employeesAmount;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", employees=" + Arrays.toString(employees) +
                ", employeesAmount=" + employeesAmount +
                ", director='" + director + '\'' +
                '}';
    }
}
