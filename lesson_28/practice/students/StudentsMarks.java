package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsMarks {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student student1 = new Student(1, "Alena");
        Student student2 = new Student(2, "Alex");
        Student student3 = new Student(3, "Alisa");
        Student student4 = new Student(4, "Aleksandr");
        Student student5 = new Student(5, "Stanislav");
        Student student10 = new Student(1, "Alena");

        service.addMarksToStudent(student1);
        service.printStudentsMarks(student1);

        service.addMarksToStudent(student2);
        service.printStudentsMarks(student2);

        service.printStudentsMarks(student10);
    }

}
