package main;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the grade here : ");
        int grade = input.nextInt();

        if (grade >=70 && grade <= 100) {
            System.out.println("Congratulation, you passed the exam!");
        } else if (grade < 70 && grade >= 0) {
            System.out.println("Sorry, you did not pass the exam.");
        } else {
            System.out.println("Invalid number");
        }

        input.close();
    }
}