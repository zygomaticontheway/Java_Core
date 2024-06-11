package streamPractice.task3;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Pasha");
        Student student2 = new Student("Masha");
        Student student3 = new Student("Sasha");
        Student student4 = new Student("Dasha");
        Student student5 = new Student("Misha");

        Map<Student, List<String>> booksOfStudent = new HashMap<>();

        String book1 = "HTML for dummies";
        String book2 = "Java for dummies";
        String book3 = "HTML for seniors";
        String book4 = "Java for seniors";
        String book5 = "C++ for dinosaurs";

        booksOfStudent.put(student1, Arrays.asList(book1, book2));
        booksOfStudent.put(student2, Arrays.asList(book1, book2, book3));
        booksOfStudent.put(student3, Arrays.asList(book4, book3));
        booksOfStudent.put(student4, Arrays.asList(book5, book1));
        booksOfStudent.put(student5, Arrays.asList(book3, book4, book1));

//        List<String> booksReadedByAll = new ArrayList<>();
//        booksReadedByAll = booksOfStudent.values().stream()
//                .flatMap(books -> Arrays.stream(books))
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(booksOfStudent);
    }
}
