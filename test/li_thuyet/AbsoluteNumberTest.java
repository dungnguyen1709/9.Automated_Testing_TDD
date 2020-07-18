package li_thuyet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
     void testFindAbsolute() {
        int number = 0;
        int expected = 0;
        AbsoluteNumber instance = new AbsoluteNumber();
        int actual = instance.findAbsolute(number);
        assertEquals(expected, actual);
    }

    @Test
     void testFindAbsolute1() {
        int number = 10;
        int expected = 10;
        AbsoluteNumber instance = new AbsoluteNumber();
        int actual = instance.findAbsolute(number);
        assertEquals(expected, actual);
    }

    @Test
     void testFindAbsolute2() {
        int number = -10;
        int expected = 10;
        AbsoluteNumber instance = new AbsoluteNumber();
        int actual = instance.findAbsolute(number);
        assertEquals(expected, actual);

    }
}