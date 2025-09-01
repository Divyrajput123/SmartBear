package expressions;

import core.LanguageDictionary;
import core.TimeExpression;

public class QuarterToExpression implements TimeExpression {
    @Override public boolean matches(int minute) {
        return minute == 45;
    }

    @Override public String express(int hour, int minute, LanguageDictionary languageDictionary) {
        return "quarter to " + languageDictionary.hourToWord((hour+1)%12);
    }
}
