package accent;

import util.NumberToWordConverter;

public class British implements Language {

    @Override
    public String translate(int hour, int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Hour must be 0-23 and minute 0-59");
        }

        String hourWord = hour == 0 ? "midnight" : hour == 12 ? "noon" : NumberToWordConverter.numberToWord(hour);
        String nextHourWord = (hour == 0) ? "one" :
            (hour == 11) ? "noon" :
                (hour == 12) ? "one" :
                        NumberToWordConverter.numberToWord(hour + 1);

        if (minute == 0) {
            if (hour == 0) return "midnight";
            if (hour == 12) return "noon";
            return hourWord + " o'clock";
        }

        if (minute == 15) {
            if (hour == 0) return "quarter past midnight";
            if (hour == 12) return "quarter past noon";
            return "quarter past " + hourWord;
        }

        if (minute == 30) {
            if (hour == 0) return "half past midnight";
            if (hour == 12) return "half past noon";
            return "half past " + hourWord;
        }

        if (minute == 45) {
            return "quarter to " + nextHourWord;
        }

        return hourWord + " " + NumberToWordConverter.numberToWord(minute);
    }


}
