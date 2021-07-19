package com.company;

//import util class to use Scanner
import java.util.Scanner;
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
 * Version 2.0
 * Additions- Accepts a string as input from user and prints it vertically
 */
public class String_Vertical2 {

    public static void main(String[] args){
            //Method call in main
            Vertical("");

        }

        /**
         * @param letter- Takes in a string and prints each index vertically
         */
        public static void Vertical(String letter){
            //for loop to count the string using length method and using 0 index convention.
            //so for each character at an index, charAt method is used to reveal that character in printed vertically
            //as output.
            //Use of Scanner to take to a string input from a user
            System.out.print("Enter a sentence: ");
            Scanner con = new Scanner(System.in);
            letter=con.nextLine();
            for(int i = 0;i< letter.length();i++){
                System.out.println(letter.charAt(i));
            }

        }

    }

