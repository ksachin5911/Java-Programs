package com.advanced;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class a126Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt  = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy --E a");
        //E means day of the week and a means whether it is AM or PM
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = dt.format(df);
        String mydate2 = dt.format(df2);
        System.out.println(mydate);
        System.out.println(mydate2);
    }
}