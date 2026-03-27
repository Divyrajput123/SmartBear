package util;

public class TimeParser {
    public int[] parseTime(String time) {
        String[] parts = time.split(":");
        int hour;
        int minute;

        try {
            hour = Integer.parseInt(parts[0]);
            minute = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Hour and minute must be valid integers");
        }

        if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Hour must be between 0-12 and minute between 0-59");
        }

        return new int[]{hour, minute};
    }
}
