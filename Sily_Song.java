/*

@author Omoze Oyarebu

Project Idea- Write a program that produces as output the words of the
                following silly song. Use methods for each verse and for
                repeated text.
 From- Chapter 1 of Building Java programs 5th Edition.

 Song- I once wrote a program that wouldn't compile
I don't know why it wouldn't compile,
My TA just smiled.
My program did nothing
So I started typing.
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.
"Parse error," cried the compiler
Luckily I'm such a code baller.
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.
Now the compiler wanted an identifier
And I thought the situation was getting dire.
I added a main method with its String[] args,
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.
Java complained it expected an enum
Boy, these computers really are dumb!
I added a public class and called it Scum,
I added a main method with its String[] args,
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.
                */




public class Sily_Song {

    public static void main(String[] args) {
        System.out.println("I once wrote a program that wouldn't compile");
        repeated_Verse();
        repeated_Verse2();

        sequence_Verse();
        repeated_Verse3();
        repeated_Verse();
        repeated_Verse2();

        sequence_Verse2();
        repeated_Verse4();
        repeated_Verse3();
        repeated_Verse();
        repeated_Verse2();

        sequence_Verse3();
        repeated_Verse5();
        repeated_Verse4();
        repeated_Verse3();
        repeated_Verse();
        repeated_Verse2();

        sequence_Verse4();
        repeated_Verse5();
        repeated_Verse4();
        repeated_Verse3();
        repeated_Verse();
        repeated_Verse2();


    }

    // repeated_verse 1 to 5 are the song lines that appear multiple times.
    public static void repeated_Verse() {
        System.out.println("I don't know why it wouldn't compile,");
    }
    public static void repeated_Verse2(){
        System.out.println("My TA just smiled.\n");
    }
    public static void repeated_Verse3() {
        System.out.println("I added System.out.println('I <3 coding'),");
    }
    public static void repeated_Verse4() {
        System.out.println("I added a backslash to escape the quotes,");
    }
    public static void repeated_Verse5() {
        System.out.println("I added a main method with its String[] args,");
    }

    //The sequence_Verse 1 to 4 are the unique verses that appear once
    public static void sequence_Verse() {
        System.out.println("My program did nothing \nSo I started typing");
    }
    public static void sequence_Verse2() {
        System.out.println("'Parse error,' cried the compiler.\nLuckily i'm such a code baller.");
    }

    public static void sequence_Verse3() {
        System.out.println("Now the compiler wanted an identifier \nAnd i thought the situation was getting dire.");
    }

    public static void sequence_Verse4() {
        System.out.println("Java complained it expected an enum \nBoy, these computers really are dumb!");
        System.out.println("I added a public class and called it Scum,");
    }
}
