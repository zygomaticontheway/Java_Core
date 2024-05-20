package lesson_27.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepository {
    private Map<String, List<String>> dictionary;

    public DictionaryRepository() {
        this.dictionary = new HashMap<>();
    }

    public Map<String, List<String>> getDictionary() {
        return dictionary;
    }

    public void addNewWordInDictionary (DictionaryEntity word){
        dictionary.put(word.getForeignWord(), word.getTranslations());
    }

    public void printTranslations (String word){
        System.out.println("Translations of the word " + word.toUpperCase() + ":");

    }

    @Override
    public String toString() {
        return "DictionaryRepository{" +
                "dictionary=" + dictionary +
                '}';
    }


}
