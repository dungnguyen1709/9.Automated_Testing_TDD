package tinh_ngay_tiep_theo;

import org.junit.Test;

import java.util.Date;

public class NextDayCalculator {
    public int day;
    public int month;
    public int year;
    public int lastDay;
    public int lastMonth;
    public int lastYear;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        boolean isDivisibleBy4 = this.year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = this.year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = this.year % 400 == 0;
                if (isDivisibleBy400) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return  false;
    }

    public int getDayOfMonth() {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                boolean isLeapYear = isLeapYear();
                if (isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return 0;
        }
    }

    public int checkYear(){
        if (this.month == 12 && this.day == 31) {
            lastYear = year + 1;
        } else {
            lastYear = year;
        }
        return lastYear;
    }

    public int checkMonth(){
        if (this.month == 12){
            lastMonth = 1;
        } else if (day == getDayOfMonth()) {
            lastMonth = month + 1;
        } else {
            return lastMonth = month;
        }
        return lastMonth;
    }

    public int checkDay() {
        if (day == getDayOfMonth()) {
            lastDay = 1;
        } else {
            lastDay = day + 1;
        }
        return lastDay;
    }
}
