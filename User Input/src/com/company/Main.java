package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // user input

        System.out.println("What is your name?"); // prompt to allow user to know they need to input their name as sting
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        // output
        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your favorite food is " + food);
    }
}
