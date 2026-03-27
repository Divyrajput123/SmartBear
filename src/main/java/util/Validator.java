package util;

import util.TimeParser;

public class Validator {
    private TimeParser timeParser;

    public Validator(){
        timeParser = new TimeParser();
    }
    public void validate(String time){
        if (time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Time cannot be null or empty");
        }
        if (!time.matches("\\d{1,2}:\\d{2}")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM");
        }
        int parsedTime[] = timeParser.parseTime(time);
        if (parsedTime[1] < 0 || parsedTime[1] >= 60) {
            throw new IllegalArgumentException("minute must be  0-59");
        }
        if (parsedTime[0] < 0 || parsedTime[0] >= 60) {
            throw new IllegalArgumentException("hour must be  0-12");
        }
    }
}
