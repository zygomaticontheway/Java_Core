package lesson_27.dictionary;

import Lesson18hw.company.UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DictionaryService {
    private UserInput ui = new UserInput();

    private DictionaryRepository dictionaryRepository = new DictionaryRepository();
    private Map<String, List<String>> dictionary = dictionaryRepository.getDictionary();


    public DictionaryService() {
        this.dictionaryRepository = dictionaryRepository;
    }

    public void addNewWordToDictionary() {

        String word = ui.inputText("Enter the word to be translated: ");
        String translation = ui.inputText("Enter the translation: ");

        List<String> translations = new ArrayList<>();
        translations.add(translation);

        DictionaryEntity newWord = new DictionaryEntity(word,translations);

        dictionaryRepository.addNewWordInDictionary(newWord);
        System.out.println(dictionaryRepository);

    }
    public void addTranslationToExistingWord() {
        String existingWord = ui.inputText("Enter the word to which you want to add a translation: ");
        String translation = ui.inputText("Enter the translation: ");

//        System.out.println(dictionary.get(existingWord));
//        System.out.println(dictionary);
        if (dictionary.containsKey(existingWord)) {
            dictionary.get(existingWord).add(translation);
            }
        else {
            System.out.println("Can't find the " + '\"' + existingWord + '\"' + " in dictionary");
        }
    }
    public void printDictionary () {
        System.out.println("====== DICTIONARY ======");
        for (int i = 0; i < dictionary.size(); i++) {
            List<String> keys = new ArrayList<String>(dictionary.keySet());
            System.out.println(keys.get(i) + " = " + dictionary.get(keys.get(i)));
        }
    }
    public void printWordFromDictionary () {
        System.out.println("====== Translation ======");
        String existingWord = ui.inputText("Enter the word to see the translation: ");
        System.out.println(existingWord + " -> " + dictionary.get(existingWord));

    }
}
