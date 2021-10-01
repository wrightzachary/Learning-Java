package com.company;

public class Main {

    public static void main(String[] args) {

        // expressions = operands & operators
        // operands = values, variables, numbers,, quantity
        // operators =  + - * / %

        // Adding
        int friends = 10; // declaring variable

        friends++ ; // adding value to variable

        //output
        System.out.println("Friends: " + friends);

        //Subtracting
        int family = 20; // declaring variable

        family--; // subtracting value from variable

        //output
        System.out.println("Family: " + family);

        // Multiplying
        int teammates = 10; // declaring variable

        teammates = teammates * 2; // Multiplying value

        //output
        System.out.println("Teammates: " + teammates);

        // Dividing
        int peers = 30; // declaring variable

        peers = peers / 2; // Dividing variable

        //output
        System.out.println("Peers: " + peers);

        // Modulus
        int songs = 90; // declaring variable

        songs = songs % 4; // adding value to variable

        //output
        System.out.println("Songs: " + songs);

        //Integer division
        double pizzaSlices = 10; // declaring variable

        pizzaSlices = (double) pizzaSlices / 3; // Integer division using double

        System.out.println("Pizza slices left " + pizzaSlices);
    }
}
