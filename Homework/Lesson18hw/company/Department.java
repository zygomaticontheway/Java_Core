package Lesson18hw.company;

public class Department {
    private String departmentName;
    private int employeesAmount;
    private String headOfDepartment;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public Department(String departmentName, int employeesAmount) {
        this.departmentName = departmentName;
        this.employeesAmount = employeesAmount;
    }
    public Department(String departmentName, int employeesAmount, String headOfDepartment) {
        this.departmentName = departmentName;
        this.employeesAmount = employeesAmount;
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getEmployeesAmount() {
        return employeesAmount;
    }

    public void setEmployeesAmount(int employeesAmount) {
        this.employeesAmount = employeesAmount;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departmentName='" + departmentName + '\'' +
                ", employeesAmount=" + employeesAmount +
                ", headOfDepartment='" + headOfDepartment + '\'' +
                '}';
    }
}
