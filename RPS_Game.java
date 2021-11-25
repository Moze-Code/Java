/**
 * @author -Omoze Oyarebu
 * Project-Write a game that plays many rounds of Rock(0) Paper(1) Scissors(2).
 *         The user and computer will each choose between three items:
 *          rock (defeats scissors, but loses to paper), paper (defeats
 *          rock, but loses to scissors), and scissors (defeats paper, but
 *          loses to rock). If the player and computer choose the same
 *          item, the game is a tie.
 *
 *
 * Version 1.0
 */

package com.company;

import java.util.Random;
import java.util.Scanner;


public class RPS_Game {
    public static void main(String[] args){
        Scanner Con = new Scanner(System.in);
        Rules();
        int per = Person_play(Con);
        //System.out.println("per pick num =" + per);
        int comp =Computer_play(Con);
        //System.out.println("Comp pick num =" + comp);
        Winner(comp,per);
    }

     //Rules of the game
    public static void Rules(){
        System.out.println("Welcome the Rock-Paper-Scissors game.");
        System.out.println("The rules are as follows;");
        System.out.println("Rock defeats Scissors, but loses to Paper.");
        System.out.println("Scissors defects Paper, but loses to Rock.");
        System.out.println("Paper defeats Rock, but loses to Scissors.");
        System.out.println();
        System.out.println("To pick enter 0-(Rock), 1-(Paper), 2-(Scissors)");

    }


    //Code for Computer Selection
    /**
     *
     * @param con -Allows more scope to call in main, which is needed to compute results
     * @return -The computers pick
     */
    public static int Computer_play(Scanner con){
        Random ran = new Random();
        int play= ran.nextInt(3); //0(inclusive) to 3(exclusive)
        int count =-1;
        while(play != count){
            if(play == 0){
                System.out.println("Computer picked: Rock");
                //play =play;
            }else if(play == 1){
                System.out.println("Computer picked: Paper");
                //play =play;

            }else if(play == 2) {
                System.out.println("Computer picked: Scissors");
                //play =play;
            }
            //play =play;
            count = play;
        }
        return play;
    }


    //Code for Human selection
    /**
     *
     * @param con -Allows more scope to call in main, which is needed to compute results
     * @return -The Human player's pick
     */
    public static int Person_play(Scanner con){
        System.out.println();
        System.out.println("Your turn: ");
        Scanner con1 = new Scanner(System.in);
        int play2 = con1.nextInt(3);
        int count1 =-1;
        while(play2 !=count1){

            if(play2 == 0){
                System.out.println("You picked: Rock");
                //play2 =play2;
            }else if(play2 == 1){
                System.out.println("You picked: Paper");
                //play2 =play2;

            }else if(play2 == 2) {
                System.out.println("You picked: Scissors");
                //play2 =play2;
            }
            //play2 =play2;
            count1 = play2;
        }
        return play2;
    }


    //Code for deciding the Winner
    /**
     *
     * @param comp-Takes the Computers pick and uses it to decide who wins
     * @param per-Takes the Human's pick and uses it to decide who wins
     */
    public static void Winner(int comp, int per){
        System.out.println();
        if(comp == per){
            System.out.println("Tie, play again");
        } else if((comp == 0)&&(per == 2)){
            System.out.println("Computer Wins");
        } else if((comp == 1)&&(per ==0 )){
            System.out.println("Computer wins");
        } else if((comp == 2) && (per == 1)){
            System.out.println("Computer wins");
        }else
            System.out.println("You win");


    }
}
