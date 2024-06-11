package lesson_42.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElementsTask2 {
    /*
Задача 2: Группировка элементов и подсчёт количества

Задание: Дан список объектов сотрудников (Employee),
где каждый объект содержит имя и отдел, в котором работает сотрудник.
Необходимо сгруппировать сотрудников по отделам и подсчитать
количество сотрудников в каждом отделе.
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Super Man", "Logistics"));
        employees.add(new Employee("Super Woman", "QA"));
        employees.add(new Employee("Spider Man", "Engineer"));
        employees.add(new Employee("Aqua Man", "Engineer"));
        employees.add(new Employee("Cat Woman", "HR"));
        employees.add(new Employee("Bath Man", "Logistics"));
        employees.add(new Employee("Butter Man", "Security"));
        employees.add(new Employee("Sexy Woman", "Management"));
        employees.add(new Employee("Ugly Woman", "Management"));

        Map<String, Long> departments = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(departments);

    }
}
