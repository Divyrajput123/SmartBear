package translation;

import org.junit.jupiter.api.Test;
import util.Translator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslatorTest {
    private final Translator converter = new Translator("en");

    @Test
    void testOneOClock() {
        assertEquals("one o'clock", converter.convertTime("1:00"));
    }

    @Test
    void testQuarterPastFour() {
        assertEquals("quarter past four", converter.convertTime("4:15"));
    }

    @Test
    void testHalfPastSeven() {
        assertEquals("half past seven", converter.convertTime("7:30"));
    }

    @Test
    void testQuarterToTen() {
        assertEquals("quarter to ten", converter.convertTime("9:45"));
    }

    @Test
    void testMidnight() {
        assertEquals("midnight", converter.convertTime("00:00"));
    }

    @Test
    void testNoon() {
        assertEquals("noon", converter.convertTime("12:00"));
    }

    @Test
    void testDigitalTimeSixThirtyTwo() {
        assertEquals("six thirty-two", converter.convertTime("6:32"));
    }

    @Test
    void testDigitalTimeZeroFifteen() {
        assertEquals("quarter past midnight", converter.convertTime("00:15"));
    }
}
