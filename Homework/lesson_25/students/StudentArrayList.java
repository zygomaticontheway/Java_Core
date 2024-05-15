package lesson_25.students;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivan"));
        students.add(new Student("Robert"));
        students.add(new Student("Carlos"));
        students.add(new Student("Javi"));
        students.add(new Student("Umberto"));

        System.out.println(students);

        ArrayList<Student> reverseStudent = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            reverseStudent.add(0, students.get(i));
        }
        System.out.println("========== reverse ==========");
        System.out.println(reverseStudent);

        students.remove(0);

        System.out.println("========== removed Ivan ==========");
        System.out.println(students);

    }
}
