package li_thuyet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        int num1 = 10;
        int num2 = 20;
        int expected = 30;
        Calculator instance = new Calculator();
        int actual = instance.add(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void testMax() {
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        Calculator instance = new Calculator();
        try {
            int actual = instance.add(num1, num2);
            assertFalse(true);
        } catch(Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    void testMin() {
        int num1 = Integer.MIN_VALUE;
        int num2 = -1;
        Calculator instance = new Calculator();
        try {
            int actual = instance.add(num1, num2);
            assertFalse(true);
        } catch(Exception ex) {
            assertTrue(true);
        }
    }
}
