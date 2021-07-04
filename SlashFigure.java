package com.company;
/*
@author Omoze Oyarebu
@Version 1.0

Write a Java program called SlashFigure that produces the
following output. Use nested for loops to capture the
structure of the figure. (See also Self-Check Problems 34
and 35 .)
!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
 */
public class SlashFigure {
    public static void main(String[] args) {
        for(int line = 1; line <= 6; line++) { //Outer for loop that prints 6 new lines
            for(int slash = 1; slash <= (2 * line)-2; slash++) { //Inner for loop that prints \ as a single output
                System.out.print("\\");
            }
            for(int exclam = 1; exclam<= (-4 *line)+26; exclam++){ //Inner for loop that prints ! as a single output
                System.out.print('!');
            }
            for(int bslash = 1; bslash<= (2 * line)-2; bslash++) { //Inner for loop that prints / as a single output
                System.out.print("/");
            }
            System.out.println(); // Outer for loop statement responsible for printing the results of the inner
        }                           // for loops and going to a newline on and on till 6

    }

}


/*
Output :


!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

Process finished with exit code 0

 */