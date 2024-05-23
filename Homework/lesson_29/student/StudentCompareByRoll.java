package lesson_29.student;

import java.util.Comparator;

public class StudentCompareByRoll implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int compareResult = student1.getRoll() - student2.getRoll();
        return compareResult;
    }

}
