package lesson_27.dictionary;

import Lesson18hw.company.UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DictionaryService {
    private UserInput ui = new UserInput();

    private Map<String, DictionaryEntity> dictionary;
    private DictionaryRepository dictionaryRepository = new DictionaryRepository();

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

//        System.out.println(dictionaryRepository.getDictionary().get(existingWord));
//        System.out.println(dictionary);
        if (dictionaryRepository.getDictionary().containsKey(existingWord)) {
            dictionaryRepository.getDictionary().get(existingWord).add(translation);
            }
        else {
            System.out.println("Can't find the " + '\"' + existingWord + '\"' + " in dictionary");
        }
    }
    public void printDictionary () {
        System.out.println("====== DICTIONARY ======");
        for (int i = 0; i < dictionaryRepository.getDictionary().size(); i++) {
            List<String> keys = new ArrayList<String>(dictionaryRepository.getDictionary().keySet());
            System.out.println(keys.get(i) + " = " + dictionaryRepository.getDictionary().get(keys.get(i)));
        }
    }
}
