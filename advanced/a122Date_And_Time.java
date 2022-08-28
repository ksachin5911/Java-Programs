package com.advanced;

import java.util.Date;

public class a122Date_And_Time {
    public static void main(String[] args) {
        long e = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//it gives years passed since
            //1970.
        System.out.println(e);
        //total milliseconds in long
        System.out.println(Long.MAX_VALUE);
        //Today's date
        Date d  = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
    }
}