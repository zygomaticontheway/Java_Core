package students;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private Map<String, Integer> marks;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
