package students;

import Lesson18hw.company.UserInput;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private UserInput ui = new UserInput();
    private Student student;
    private Map<Student, Map<String, Integer>> studentMap;

    public StudentService() {
        this.student = student;
        this.studentMap = new HashMap<>();
    }


    public Map<Student, Map<String, Integer>> addMarksToStudent (Student student){
        Map<String, Integer> marks = new HashMap<>();
        System.out.println("Заполнение оценок студента: " + student.getName());

        int amount = ui.inputInt("Введите количество предметов:");
        for (int i = 0; i < amount; i++) {
            String subjectTitle = ui.inputText("Введите название предмета:");
            Integer subjectMark = ui.inputInt("Введите оценку по этому предмету:");

            marks.put(subjectTitle, subjectMark);
        }

        studentMap.put(student, marks);
        return studentMap;
    }

    public Student getStudent() {
        return student;
    }

    public Map<Student, Map<String, Integer>> getStudentMap() {
        return studentMap;
    }

    public void printStudentsMarks (Student student){
        System.out.println( '\n' +
                "Оценки студента " + student.getName() + ": " +
                studentMap.get(student) +
                '\n' + "=================================="
        );
    }

}
