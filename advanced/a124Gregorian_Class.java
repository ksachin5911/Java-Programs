package com.advanced;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class a124Gregorian_Class {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2005));
        System.out.println(g.getTime());
        int i=0;
        while(i<10)
        {
            System.out.println(TimeZone.getAvailableIDs()[i]);
            i++;
        }
    }
}
