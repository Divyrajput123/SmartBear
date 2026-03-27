package core;

import expressions.*;
import util.TimeParser;
import util.Validator;

import java.util.Arrays;
import java.util.List;

public class Translator {
    private final LanguageDictionary dictionary;
    private final List<TimeExpression> expressions;

    private TimeParser timeParser;
    private Validator validator;

    public Translator(LanguageDictionary languageDictionary) {
        this.dictionary = languageDictionary;
        expressions = Arrays.asList(
            new OClockExpression(),
            new QuarterPastExpression(),
            new HalfPastExpression(),
            new QuarterToExpression(),
            new DefaultExpression()
        );
        validator = new Validator();
        timeParser = new TimeParser();
    }

    public String convertTime(String time){
        validator.validate(time);
        int parsedTime[] = timeParser.parseTime(time);
        return expressions.stream().filter(exp->exp.matches(parsedTime[1])).findFirst().orElse(new DefaultExpression()).express(parsedTime[0], parsedTime[1],dictionary);
    }


}
