package com.company;

/**
 * Author- Omoze Oyarebu
 * Exercise- Write a method called toBinary that accepts an integer as a
 *              parameter and returns a String containing that integer’s
 *              binary representation. For example, the call of
 *              printBinary(44) should return "101100" .
 *
 * Notes - This solution only applies for numbers between [0,Infinity]
 * Version 1.0
 */

public class IntegerToBinaryConverter {
    public static void main(String[] args) {
        System.out.println("Integer to Binary Converter.");
        System.out.println("Converted value: ");
        System.out.println(toBinary(111));

    }

    public static String toBinary(int integer) {
        String Result = "";
        Result = integer % 2 + Result; // perform mod division then, Concatenate to String
        integer = integer /2; // Perform regular division
        while (integer != 0){
            Result = integer % 2 + Result;
            integer = integer /2;
        }
        return Result;
    }
}


