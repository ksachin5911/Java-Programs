package com.advanced;

import java.util.ArrayDeque;

public class a120Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(55);
        a1.add(34);
        a1.add(44);
        a1.addFirst(77);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}