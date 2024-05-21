package lesson_28.wordsCounter;

import Lesson18hw.company.UserInput;


public class WordsCounter {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String string;
        int counter = 0;

        string = ui.inputText("Enter a text, then you'll know the amount of the words");
        char [] characterList = string.toCharArray();

        if (characterList[characterList.length-1] == ' ' ){

            for (int i = 0; i < characterList.length -1; i++) {
                if (characterList[i] != ' ' && characterList[i+1] == ' '){
                    counter++;
                }
            }
        }
        else {
            for (int i = 0; i < characterList.length -1; i++) {
                if (characterList[i] != ' ' && characterList[i+1] == ' '){
                    counter++;
                }
            }
            counter++;
        }

        System.out.println("The amount of words is: " + counter);
    }
}
