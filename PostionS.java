package com.company;
/* @author Omoze Oyarebu
@version 1.0

In physics, a common useful equation for finding the position
of a body in linear motion at a given time , based on its
initial position , initial velocity , and rate of acceleration ,
is the following:
Write code to declare variables for , , , and , and then
write the code to compute on the basis of these values.
 */
public class PostionS {
    public static void main(String[] args) {

        double Time = 10.0; //Time variable Declaration
        double in_Position = 12.0; // Initial Position Variable Declaration
        double In_Velocity = 3.5; // Initial Velocity Variable Declaration
        double Rate_Accel = 9.8; // Rate of Acceleration Variable Declaration
        double S = (in_Position + (In_Velocity * Time)+ ( 0.5 * Rate_Accel * Time * Time)); //The position Equation

    System.out.println(S); //Returning the computed output

    }
}
