package lesson_27.dictionary;

public class DictionaryApp {
    public static void main(String[] args) {
        DictionaryService service = new DictionaryService();
        service.addNewWordToDictionary();
        service.addNewWordToDictionary();
        service.addNewWordToDictionary();
        service.addNewWordToDictionary();
        service.addNewWordToDictionary();

        service.addTranslationToExistingWord();

        service.printDictionary();
    }
}
