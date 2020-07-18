package tinh_ket_qua_fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizz10() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizzBuzz7() {
        int number = 7;
        String expected = Integer.toString(number);

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}