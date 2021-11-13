package com.company;
/**
 * Author- Omoze Oyarebu
 * Program Detail- Simple While loop test
 */

import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {

        // Ask user for a number
        Scanner Con = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = Con.nextInt();

        //Take that number and divide by 2, while updating the "num" variable to the result of the division
        //and repeating till the "num > 0" condition turns false
        while (num > 0 ) {
            num = num / 2;
            System.out.println(num);

        }
    }
}

