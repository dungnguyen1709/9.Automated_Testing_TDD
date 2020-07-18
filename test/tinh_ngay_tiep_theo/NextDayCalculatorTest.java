package tinh_ngay_tiep_theo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testFindForTheDate() {
        int day = 1;
        int month = 1;
        int year = 2018;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(2, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(1, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2018, resultYear);

    }

    @Test
    void testFindForTheDate1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(2, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2018, resultYear);
    }

    @Test
    void testFindForTheDate2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(5, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2018, resultYear);
    }

    @Test
    void testFindForTheDate3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(3, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2018, resultYear);
    }

    @Test
    void testFindForTheDate4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(3, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2020, resultYear);
    }

    @Test
    void testFindForTheDate5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        NextDayCalculator nextDayCalculator = new NextDayCalculator(day, month, year);

        int resultDay = nextDayCalculator.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDayCalculator.checkMonth();
        assertEquals(1, resultMonth);
        int resultYear = nextDayCalculator.checkYear();
        assertEquals(2019, resultYear);

    }
}