package lesson_29.student;

import java.util.Comparator;

public class StudentCompareByName implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int compareResult = student1.getName().compareTo(student2.getName());
        return compareResult;
    }
}
