package expressions;

import core.LanguageDictionary;
import core.TimeExpression;

public class QuarterPastExpression implements TimeExpression {
    @Override public boolean matches(int minute) {
        return minute == 15;
    }

    @Override public String express(int hour, int minute, LanguageDictionary languageDictionary) {
        if (hour == 0) return "quarter past midnight";
        if (hour == 12) return "quarter past noon";
        return "quarter past " + languageDictionary.hourToWord(hour);
    }
}
