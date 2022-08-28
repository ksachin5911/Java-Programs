package com.advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class a125Local_DateTime_Class {
    public static void main(String[] args) {
        LocalDate l =  LocalDate.now();
        System.out.println(l);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
