package lesson_39;

import Lesson18hw.company.UserInput;

//1. Напишите функциональный интерфейс для преобразования строки в верхний регистр.
//3. Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
public class StringTasks {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        String string = ui.inputText("Write something to play with");

        IStringOperations ref = (String newInput) -> {
            String uppercasedString = newInput.toUpperCase();
            return uppercasedString;
        };
        System.out.println(toUppercase(ref, string));

    }
    public static String toUppercase (IStringOperations ref, String string){
        String result = ref.operationsWithString(string);
        return result;
    }

}
