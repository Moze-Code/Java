package com.company;

/**
 * author- Omoze Oyarebu
 * Exercise- Write a method called repl that accepts a String and a
 *           number of repetitions as parameters and returns the String
 *           concatenated that many times. For example, the call
 *           repl( "hello ", 3) should return "hellohellohello" . If the
 *           number of repetitions is zero or less, the method should return
 *           an empty string.
 *
 * Version: 1.0
 */
public class StringRepeat {
    public static void main(String[] args) {
        repl("Hello", 3);
    }

    /**
     *
     * @param s - String object
     * @param repetition - Number of times String object 's' is printed
     */
    public static void repl(String s, int repetition) {

        if (repetition <= 0) {
            System.out.print("Empty String");
        } else {
            for (int i = 0; i < repetition; i++) {
                System.out.print(s);

            }
        }
    }
}
