package com.advanced;
import java.util.*;

public class a118ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(447);
        l1.add(4);
        l1.add(7);
        l1.add(55);
        l2.add(67);
        l1.add(8);
        l1.add(4);
        l1.add(4,67);
        l1.add(10);
        l1.addAll(l2);//addAll adds all the elements of another arraylist to previous one
        //l1.clear();//it clears all elements of arraylist
        System.out.println(l1.remove(3));
        System.out.println(l1.set(2,1000));
        for(int i=0; i< l1.size();i++)
        {
            System.out.print(l1.get(i) + " ");
        }
        System.out.print("\n");
        System.out.println(l2.contains(34));//it returns a bool value whether the element is present
                                                // or not
        System.out.println(l1.indexOf(1000));//gives index of an element
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));//gives last index of element
        System.out.println("Size = " + l1.size());//gives the size i.e. total no. of elements
    }
}
