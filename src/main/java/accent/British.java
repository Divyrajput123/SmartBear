package accent;

import util.NumberToWordConverter;

public class British implements Language {

    @Override public String translate(int hour, int minute) {
        if (minute < 30 && minute >= 0) {
            if (minute == 15)
                return "quarter past " + NumberToWordConverter.numberToWord(hour);
            else if (minute == 0) {
                if (hour == 0)
                    return "midnight";
                else if (hour == 12)
                    return "noon";
                else
                    return NumberToWordConverter.numberToWord(hour) + " o'clock";
            } else
                return NumberToWordConverter.numberToWord(minute) + " past "
                    + NumberToWordConverter.numberToWord(hour);


        } else if (minute == 30) {
            if (hour == 0) {
                return "half past midnight";
            } else if (hour == 12) {
                return "half past noon";
            } else {
                return "half past " + NumberToWordConverter.numberToWord(hour);
            }

        } else if (minute > 30 && minute < 60) {
            if (minute == 45) {
                hour = hour == 12 ? 1 : hour + 1;
                return "quarter to " + NumberToWordConverter.numberToWord(hour);
            } else if (minute % 5 == 0) {
                hour = hour == 12 ? 1 : hour + 1;
                return NumberToWordConverter.numberToWord(60-minute) + " to "
                    + NumberToWordConverter.numberToWord(hour);
            } else
                return NumberToWordConverter.numberToWord(hour) + " "
                    + NumberToWordConverter.numberToWord(minute);
        } else {
            throw new IllegalArgumentException("Minute must be between 0-59");
        }
    }
}
