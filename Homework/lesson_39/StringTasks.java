package lesson_39;

import Lesson18hw.company.UserInput;

import java.util.Arrays;

//1. Напишите функциональный интерфейс для преобразования строки в верхний регистр.
//3. Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
public class StringTasks {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        String text = ui.inputText("Write something to play with");

        IStringOperations refUppercase = ( newInput) -> {
            String uppercasedString = newInput.toUpperCase();
            return uppercasedString;
        };
        System.out.println(toUppercase(refUppercase, text));

        IIsPalindrom refPalindrom = ( newInput) -> {

            String textNoSpaces = text.replace(" ", "");
            char[] textToCharArray = textNoSpaces.toCharArray();
            char[] reverseTextAsChar = new char[textToCharArray.length];

            for (int i = 0; i < textToCharArray.length; i++) {
                reverseTextAsChar[i] = textToCharArray[textToCharArray.length -i -1];
            }

            return Arrays.toString(textToCharArray).equalsIgnoreCase(Arrays.toString(reverseTextAsChar));
        };
        System.out.println(text + " is palindrome: " + isPalindrom(refPalindrom, text));

    }
    public static String toUppercase (IStringOperations ref, String string){
        String result = ref.operationsWithString(string);
        return result;
    }
    public static boolean isPalindrom (IIsPalindrom ref, String string){
        boolean result = ref.isPalindrom(string);
        return result;
    }

}
