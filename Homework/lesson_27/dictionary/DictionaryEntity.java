package lesson_27.dictionary;

import java.util.List;
import java.util.Objects;

public class DictionaryEntity {
    private String foreignWord;
    private List<String> translations;

    public DictionaryEntity(String foreignWord, List<String> translations) {
        this.foreignWord = foreignWord;
        this.translations = translations;
    }

    public String getForeignWord() {
        return foreignWord;
    }

    public List<String> getTranslations() {
        return translations;
    }

    @Override
    public String toString() {
        return "DictionaryEntity{" +
                "foreignWord='" + foreignWord + '\'' +
                ", translations=" + translations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DictionaryEntity)) return false;
        DictionaryEntity that = (DictionaryEntity) o;
        return Objects.equals(foreignWord, that.foreignWord) && Objects.equals(translations, that.translations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foreignWord, translations);
    }
}
