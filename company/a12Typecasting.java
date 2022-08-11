package com.company;

public class a12Typecasting {
    public static void main(String[] args){
        char grade = 'A';
        grade = (char)(grade + 8);//Typecasting --> changing the datatype according to requirement
        System.out.println(grade);
        
        //Decrypting the grades
        grade = (char)(grade -8);//Again typecasting
        System.out.println(grade);

    }
}