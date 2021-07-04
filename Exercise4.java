package com.company;
//Chapter 2, Exercise 4

/*Write nested for loops to produce the following output:
        *****
        *****
        *****
        *****
 */
 /* Technique- Looking at the figure, i know that it has 4 lines of '*'.
                Each line has 5 * printed


    Pseudocode - for(each of 4 lines) {
                       for(each of 5 lines) {
                            print 5 '*'
                       }
                    Go to a newline
                   }*/
public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
