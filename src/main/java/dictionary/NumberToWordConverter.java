package dictionary;

public class NumberToWordConverter {
    public static final String ones[] = {
        "zero",  "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine","ten","eleven","twelve","thirteen","fourteen","sixteen","seventeen","eighteen","nineteen"
    };
    public static final String tens[] = {
        "", "", "twenty", "thirty", "forty", "fifty"
    };

    public static String numberToWord(int number) {
        if (number < 0 || number > 60) {
            throw new IllegalArgumentException("Number must be between 1 and 60");
        }

        if (number < 20) {
            return ones[number];
        } else {
            int t = number / 10;
            int o = number% 10;
            return tens[t] + (o > 0 ? "-" + ones[o] : "");
        }

    }
}
