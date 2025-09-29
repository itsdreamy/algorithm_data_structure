package main;

import java.util.Scanner;

public class NumberValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number here : ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        }else{
            System.out.println("Invalid number.");
        }

        input.close();
    }

}
