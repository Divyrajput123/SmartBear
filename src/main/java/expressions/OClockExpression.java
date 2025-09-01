package expressions;

import core.LanguageDictionary;
import core.TimeExpression;

public class OClockExpression implements TimeExpression {
    @Override public boolean matches(int minute) {
        return minute==0;
    }

    @Override public String express(int hour, int minute, LanguageDictionary languageDictionary) {
        if (hour == 0)
            return "midnight";
        if (hour == 12)
            return "noon";
        return languageDictionary.hourToWord(hour) + " o'clock";
    }
}
