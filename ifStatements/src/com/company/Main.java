package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // if else with int declared
        int age  = 25;

        if (age >= 18){
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }

        // if else if with string declared
        String favoriteFood = "wings";

        if (favoriteFood == "wings"){
            System.out.println("You like wings too?!");
        }
        else if (favoriteFood != "wings"){
            System.out.println("Do you not like wings?");
        }

        //if else with user input
        int marksObtained, passingMarks;

        passingMarks = 70;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();

        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        }
        else {
            System.out.println("Unfortunately, you failed to pass the exam.");
        }

    }
}
