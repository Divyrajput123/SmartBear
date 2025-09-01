package dictionary;

import core.LanguageDictionary;

public class BritishDictionary implements LanguageDictionary {

    @Override public String hourToWord(int hour) {
        return NumberToWordConverter.numberToWord(hour);
    }

    @Override public String minuteToWord(int minute) {
        return NumberToWordConverter.numberToWord(minute);
    }

}
