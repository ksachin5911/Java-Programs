package com.company;

public class a24Equal_Method {
    public static void main(String[] args){
        String s = "pantnagar";
        System.out.println(s.equals("pantnagar"));/*it returns a bool value */
        System.out.println(s.equals("Pantnagar"));/*it is case-sensitive */
        //To ignore the case we use equalsIgnoreCase method
        System.out.println(s.equalsIgnoreCase("PanTnAGaR"));
    }
}
