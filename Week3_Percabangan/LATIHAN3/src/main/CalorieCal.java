package main;

import java.util.Scanner;

public class CalorieCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose Your Activity : ");
        System.out.println("1. Running");
        System.out.println("2. Push Ups");
        System.out.println("3. Planks");

        System.out.print("Enter your choice (1/2/3) : ");
        int choice = input.nextInt();
        
        double caloriePerMinute = 0.0;
        
        if (choice == 1){
            caloriePerMinute = 12;
        }else if (choice == 2){
            caloriePerMinute = 6.67;
        }else if (choice == 3){
            caloriePerMinute = 5;
        }else{
            System.out.println("Invalid choice.");
            return;
        }
        
        System.out.println("Enter the duration of Your Activity (in minutes) : ");
        int duration = input.nextInt();

        double totalCalorie = caloriePerMinute * duration;

        if (choice == 1){
            System.out.println("You burned " + totalCalorie + " calories by running for " + duration + " minutes.");
        }else if (choice == 2){
            System.out.println("You burned " + totalCalorie + " calories by doing push ups for " + duration + " minutes.");
        }else if (choice == 3){
            System.out.println("You burned " + totalCalorie + " calories by doing planks for " + duration + " minutes.");
        }

        input.close();

    }
}