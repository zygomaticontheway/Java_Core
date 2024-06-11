package lesson_42.task2;

import java.util.Objects;

public class Employee {
    private String Name;
    private String department;

    public Employee(String name, String department) {
        Name = name;
        this.department = department;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(Name, employee.Name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, department);
    }
}
