package com.company;
/*
@author Omoze Oyarebu
@Verison 1.0

 */
public class RocketShip {

    public static final int STAR_CONSTANT = 2;
    public static final int LINE_CONSTANT = 5;
    public static final int SHAPE2_CONSTANT = 2;

    public static void main(String[] args) {
        figure1();
        figure2();
        figure3();
        figure2();
        figure4();
        figure2();
        System.out.println();
        figure1();
    }

    public static void figure1() {
        for (int line = 1; line <= LINE_CONSTANT; line++) { // outer for loop that controls the amount of lines

            for (int space = 1; space <= (-1 * line) + 6; space++) { // inner for loop that controls the amount of spaces per line
                System.out.print(" ");

            }
            for (int slash = 1; slash <= 1 * line; slash++) { // inner for loop that controls the amount of / per line
                System.out.print("/");
            }
            for (int stars = 1; stars <= STAR_CONSTANT; stars++) { // inner for loop that controls the constant amount of
                //Stars printed per line
                System.out.print("*");

            }
            for (int slash = 1; slash <= 1 * line; slash++) { // inner for loop that controls the amount of \ per line
                System.out.print("\\");
            }

            System.out.println("");
        }


    }


    public static void figure2() {
        for (int line = 1; line <= 1; line++) {
            System.out.print("+");
            for (int j = 1; j <= SHAPE2_CONSTANT * 3; j++) {
                System.out.print("=");
                System.out.print("*");
            }
            System.out.print("+");
        }
    }

    public static void figure3() {
        for (int line = 1; line <= 3; line++) {
            System.out.println("");
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }
            for (int dot = 1; dot <= (-1 * line) + 3; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= 1 * line; slash++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= -2 * line + 6; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= 1 * line; slash++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= (-1 * line) + 3; dot++) {
                System.out.print(".");
            }
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }

        }
        for (int line = 4; line <= 6; line++) {
            System.out.println("");
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }
            for (int dot = 1; dot <= 1 * line - 4; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= -1 * line + 7; slash++) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot <= 2 * line - 8; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= -1 * line + 7; slash++) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot <= 1 * line - 4; dot++) {
                System.out.print(".");
            }
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }

        }
        System.out.println();
    }

    public static void figure4() {
        for (int line = 1; line <= 3; line++) {
            System.out.println();
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }
            for (int dot = 1; dot <= 1 * line - 1; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= -1 * line + 4; slash++) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot <= 2 * line - 2; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= -1 * line + 4; slash++) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot <= 1 * line - 1; dot++) {
                System.out.print(".");
            }
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }

        }

        for (int line = 4; line <= 6; line++) {
            System.out.println();
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }
            for (int dot = 1; dot <= -1 * line + 6; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= 1 * line - 3; slash++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= -2 * line + 12; dot++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= 1 * line - 3; slash++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= -1 * line + 6; dot++) {
                System.out.print(".");
            }
            for (int stroke = 1; stroke <= 1; stroke++) {
                System.out.print("|");
            }

        }
        System.out.println();
    }
}