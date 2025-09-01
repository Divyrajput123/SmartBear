package languagefactory;

import dictionary.BritishDictionary;
import core.LanguageDictionary;

public class LanguageFactory {
    public static LanguageDictionary createLanguage(String languageCode) {
        switch (languageCode.toLowerCase()) {
            case "en":
                return new BritishDictionary();
            default:
                throw new IllegalArgumentException("Unsupported language code: " + languageCode);
        }
    }
}
