package Lesson18hw.company;

public class Employee {
    private String employeeName;
    private int employeeAge;
    private String department;
    boolean isDepartmentHead;
    boolean isDirector;

    public Employee(String employeeName, int employeeAge, String department, boolean isDepartmentHead, boolean isDirector) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.department = department;
        this.isDepartmentHead = isDepartmentHead;
        this.isDirector = isDirector;
    }

    public Employee(String employeeName, int employeeAge, String department) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isDepartmentHead() {
        return isDepartmentHead;
    }

    public void setDepartmentHead(boolean departmentHead) {
        isDepartmentHead = departmentHead;
    }

    public boolean isDirector() {
        return isDirector;
    }

    public void setDirector(boolean director) {
        isDirector = director;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", department='" + department + '\'' +
                ", isDepartmentHead=" + isDepartmentHead +
                ", isDirector=" + isDirector +
                '}';
    }
}
