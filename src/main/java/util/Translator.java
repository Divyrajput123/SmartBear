package util;

import accent.Language;
import languagefactory.LanguageFactory;

public class Translator {
    private Language language;

    private LanguageFactory languageFactory;

    private TimeParser timeParser;

    public Translator(String languageCode) {
        this.languageFactory = new LanguageFactory();
        this.language = languageFactory.createLanguage(languageCode);
        timeParser = new TimeParser();
    }

    public String convertTime(String time){
        if (time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Time cannot be null or empty");
        }
        if (!time.matches("\\d{1,2}:\\d{2}")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM");
        }
        int parsedTime[]=timeParser.parseTime(time);
        return language.translate(parsedTime[0], parsedTime[1]);
    }


}
