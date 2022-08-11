package com.company;

public class a23Index_of_Method {
    public static void main(String[] args){
        String str = "Uttarakhand";
        System.out.println(str.indexOf("kh"));
        System.out.println(str.indexOf("a", 6));
        System.out.println(str.indexOf("jh", 5));//returns -1 if the 
                                                            //string is not found
        System.out.println(str.lastIndexOf("t"));
        System.out.println(str.lastIndexOf("a", 9));/*it searches the 
                                                    string before the given string */
    }
}
