package com.company;
/*
@author Omoze Oyarebu
@Version 2.0

Modify your SlashFigure program from the previous exercise
to become a new program called SlashFigure2 that uses a
global constant for the figure’s height. (You may want to make
loop tables first.) The previous output used a constant height
of 6. The following are the outputs for constant heights of 4
and 8:

 */
public class SlashFigure2 {
    public static final int CONSTANT_SIZE =8; // Global constant Variable

    public static void main(String[] args) {

        for(int line2 = 1; line2 <= CONSTANT_SIZE; line2++) { //Outer for loop that prints lines based on Constant Size
            for(int slash = 1; slash <= (2 * line2)-2; slash++) { //Inner for loop that prints \ as a single output
                System.out.print("\\");
            }
            for(int exclam2 = 1; exclam2<= (-4 *line2)+(4 * CONSTANT_SIZE +2); exclam2++){ //Inner for loop that prints
                                                                                          // ! as a single output
                System.out.print('!');
            }
            for(int bslash2 = 1; bslash2<= (2 * line2)-2; bslash2++) { //Inner for loop that prints / as a single output
                System.out.print("/");
            }
            System.out.println(); // Outer for loop statement responsible for printing the results of the inner
        }                           // for loops and going to a newline on and on till the Constant value size is met

    }

}

/*
Output:
SIZE of 4:
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

SIZE of 8:
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!!!!!////////
\\\\\\\\\\!!!!!!!!!!//////////
\\\\\\\\\\\\!!!!!!////////////
\\\\\\\\\\\\\\!!//////////////
 */

