package core;

public interface TimeExpression {
    boolean matches(int minute);
    String express(int hour,int minute,LanguageDictionary languageDictionary);
}
