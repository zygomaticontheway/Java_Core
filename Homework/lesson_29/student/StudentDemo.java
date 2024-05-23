package lesson_29.student;

import lesson_29.student.Student;

import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student(5,"York"));
        studentsList.add(new Student(4,"Wiseman"));
        studentsList.add(new Student(3,"Bond"));
        studentsList.add(new Student(2,"Kill"));
        studentsList.add(new Student(4,"In Wonderland"));

        System.out.println(studentsList);

        Comparator<Student> comparatorByName = new StudentCompareByName();

        Set<Student> studentSortedByName = new TreeSet<>(comparatorByName);

        studentSortedByName.addAll(studentsList);
        System.out.println("========studentSortedByName========");
        for (Student student: studentSortedByName) {
            System.out.print(student.getName() + " " + student.getRoll() + " | ");
        }

        Comparator<Student> comparatorByRoll = new StudentCompareByRoll();
        Set<Student> studentSortedByRoll = new TreeSet<>(comparatorByRoll);

        studentSortedByRoll.addAll(studentsList);
        System.out.println();
        System.out.println("========studentSortedByRoll========");
        for (Student student: studentSortedByRoll) {
            System.out.print(student.getName() + " " + student.getRoll() + " | ");
        }
    }
}
