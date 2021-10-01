package com.company;

public class Main {

    public static void main(String[] args) {

        // Declaring variables
        String x = "Water";
        String y = "Kool-Aid";
        String z;

        // Original Output
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // using variable z to allow variable x and y to swap in the output
        z=x;
        x=y;
        y=z;

        //Swapped output
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
