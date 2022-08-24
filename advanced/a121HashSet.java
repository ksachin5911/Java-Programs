package com.advanced;

import java.util.HashSet;

public class a121HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(10,4.5f);
        h1.add(45);
        h1.add(78);
        h1.add(200);
        h1.add(786);
        System.out.println(h1);
        System.out.println(h1.size());
        System.out.println(h1.clone());

    }
}
