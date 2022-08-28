package com.advanced;

import java.util.Calendar;
import java.util.TimeZone;

public class a123Calendar_Class {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getWeekYear());
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) +
                ":"+c.get(Calendar.SECOND));
    }
}


