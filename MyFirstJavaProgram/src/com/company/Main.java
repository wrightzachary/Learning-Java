package com.company;

public class Main {

    public static void main(String[] args) {

        // This is a comment

        /*
        *This
        * is a
        * multi line
        * comment
        */
        // sout + tab for System.out.print
        // replace words all at the same time
        // replace all CRL + R

        System.out.print("I love coding!\n"); // using escape sequence for new line
        System.out.println("It's really fun!"); // using println for new line
        System.out.print("\tI love coding!\n"); // using escape sequence for tab
        System.out.print("\"I love coding!\n"); // using escape sequence for quotations
        System.out.print("\\I love coding!\n"); // using escape sequence for backslash in string

        /*
        *int x; // declaration
        *
        * x = 123; // assignment
        */

        int x = 7; // initialization

        System.out.println(x); // outputs variable above
        System.out.println("My favorite number is: " + x); // string concatenation

        long y = 7879285789278265062L; // long data type

        System.out.println(x); // outputs variable above
        System.out.println("Long number is: " + y); // string concatenation

        float a = 3.14f; // float variable

        System.out.println("Pi is :" + a); // string concatenation

        boolean z = true;// boolean variable default is false

        System.out.println(z);

        char symbol = '@'; // char variable

        System.out.println(symbol);

        String name = "Zach"; // string variable

        System.out.println("Hi, I'm " + name); // string concatenation

    }
}
