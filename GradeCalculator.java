package com.company;
import java.io.Console;
import java.util.*;
/**
 * author- Omoze Oyarebu
 * Project-Write a program that computes a student’s grade in a course. The course grade
 *         has three components: homework assignments, a midterm exam, and a final exam.
 *         The program should prompt the user for all information necessary to compute the
 *         grade, such as the number of homework assignments, the points earned and points
 *         possible for each assignment, the midterm and final exam scores.
 * Version 1.0
 *
 * Limitations-Unstructured approach.
 *
 */

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner Con = new Scanner(System.in);


        System.out.println("Welcome to the Grade calculator.");

        //hw
        System.out.println("What is the Hw percent contribution to overall grade?");
        double hw_weight = Con.nextDouble() / 100;
        //System.out.println("Homework weight="+hw_weight);
        System.out.println("How many Homeworks do you have?");
        int Num_hw = Con.nextInt();

        double scoreCount = 0;
        if (Num_hw >= 1) {
            double Score = 0;
            for (int i = 1; i <= Num_hw; i++) {
                System.out.println("Enter homework score " + i + "=");
                Score = Con.nextDouble();
                scoreCount = Score + scoreCount;
            }
            System.out.println("Total:" + scoreCount);
        }
        double scoreAverage=scoreCount/Num_hw;
        System.out.println("Your homework average is:"+scoreAverage+" percent.");
        double addedContribution = scoreAverage * hw_weight;
        System.out.println("Total Contribution = "+ addedContribution +" out of " + hw_weight * 100);


       //midterm
        System.out.println("What is the Midterm percent contribution to overall grade?");
        double mt_weight = Con.nextDouble()/100;

        System.out.println("Enter your midterm score:");
        double mtScore = Con.nextDouble();

        double mtContribution = mtScore * mt_weight;
        System.out.println("Midterm Contribution = " + mtContribution + " out of " +mt_weight * 100);


        //final
        System.out.println("What is the Final percent contribution to overall grade?");
        double f_weight = Con.nextDouble()/100;

        System.out.println("Enter your Final score:");
        double f_Score = Con.nextDouble();

        double f_Contribution = f_Score * f_weight;
        System.out.println("Midterm Contribution = " + f_Contribution + " out of " +f_weight * 100);


        //overall grade
        //double final_sum = hw_weight + mt_weight + f_weight * 100;
        double grade_sum = addedContribution + mtContribution + f_Contribution;
        System.out.println("Overall grade is:" + grade_sum);

        if(grade_sum >=90) {
            System.out.println("You got an A");
        } else if(grade_sum >=80) {
            System.out.println("You got a B");

        }else if(grade_sum >= 70){
            System.out.println("You got a C");

        }else{
            System.out.println("You failed the the course");
        }
    }
}
