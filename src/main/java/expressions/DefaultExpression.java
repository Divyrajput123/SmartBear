package expressions;

import core.LanguageDictionary;
import core.TimeExpression;
import dictionary.NumberToWordConverter;

public class DefaultExpression implements TimeExpression {
    @Override public boolean matches(int minute) {
        return true;
    }

    @Override public String express(int hour, int minute, LanguageDictionary languageDictionary) {
        return languageDictionary.hourToWord(hour) + " " + languageDictionary.minuteToWord(
            minute);
    }
}
