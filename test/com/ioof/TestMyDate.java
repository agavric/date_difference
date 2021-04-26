package com.ioof;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMyDate {

    private MyDate myDate;

    @Before
    public void setup() {
        this.myDate = new MyDate(1900,1,5);
    }

    @Test
    public void testDaysDifference() {
       this.myDate = new MyDate(1900,1,5);
       Assert.assertEquals(4, myDate.daysFrom1900());
    }

    @Test
    public void testMonthsDifference() {
        this.myDate = new MyDate(1900,5,5);
        Assert.assertEquals(124, myDate.daysFrom1900());
    }

    @Test
    public void testYearsDifference() {
        this.myDate = new MyDate(1901,5,5);
        Assert.assertEquals(489, myDate.daysFrom1900());
    }

    @Test
    public void testLargeYearsDifference() {
        this.myDate = new MyDate(2006,5,5);
        Assert.assertEquals(38840, myDate.daysFrom1900());
    }
}