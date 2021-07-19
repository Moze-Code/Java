package com.company;



/**
 * author Omoze Oyarebu
 * Exercise- Write a method called vertical that accepts a string as its
 *              parameter and prints each letter of the string on separate
 *              lines. For example, a call of vertical("hey now") should
 *              produce the following output:
 *              h
 *              e
 *              y
 *
 *              n
 *              o
 *              w
 * Version 1.0
 */
public class String_Vertical {
    public static void main(String[] args){
        //Method call in main
        Vertical("hey now");

    }

    /**
     * @param letter- Takes in a string and prints each index vertically
     */
    public static void Vertical(String letter){
        //for loop to count the string using length method and using 0 index convention
        //so for each character at an index, charAt method is used to reveal that character in printed vertically
        //as output

        for(int i = 0;i< letter.length();i++){
            System.out.println(letter.charAt(i));
        }

    }

}
