package languagefactory;

import accent.British;
import accent.Language;

public class LanguageFactory {
    public static Language createLanguage(String languageCode) {
        switch (languageCode.toLowerCase()) {
            case "en":
                return new British();
            default:
                throw new IllegalArgumentException("Unsupported language code: " + languageCode);
        }
    }
}
