package com.ioof;

public class MyDate {

    private static final int fromYear = 1900;
    private static final int toYear = 2010;
    private static final int[] thirtyOneDayMonths = {1,3,5,7,8,10,12};
    private static final  int[] thirtyDayMonths = {4,6,9,11};

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int daysFrom1900() {

        int days = 0;

        days = getYearDifference() + getMonthDifference() + getDaysDifference() + getLeapYearDays();

        return days;

    }

    private int getYearDifference() {

        int yearDifferenceDays = 365*(year-fromYear);

        return yearDifferenceDays;

    }

    private int getMonthDifference() {

        int monthDifferenceDays = 0;

        int i = 1;
        while(i<month){
            if(contains(thirtyOneDayMonths,i)){
                monthDifferenceDays = monthDifferenceDays + 31;
            } else if(contains(thirtyDayMonths,i)){
                monthDifferenceDays = monthDifferenceDays + 30;
            } else {
                monthDifferenceDays = monthDifferenceDays + 28;
            }
            i++;
        }

        return monthDifferenceDays;

    }

    private int getDaysDifference() {

        return day-1;

    }

    private int getLeapYearDays() {

        return (year-fromYear)/4;

    }

    private boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
