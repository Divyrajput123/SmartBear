package expressions;

import core.LanguageDictionary;
import core.TimeExpression;

public class HalfPastExpression implements TimeExpression {
    @Override public boolean matches(int minute) {
        return minute == 30;
    }

    @Override public String express(int hour, int minute, LanguageDictionary languageDictionary) {
        if (hour == 0) return "half past midnight";
        if (hour == 12) return "half past noon";
        return "half past " + languageDictionary.hourToWord(hour);
    }
}
