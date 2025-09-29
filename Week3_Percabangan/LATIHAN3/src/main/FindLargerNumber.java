package main;

import java.util.Scanner;

public class FindLargerNumber {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Input the first number here: ");
      int num1 = input.nextInt();

      System.out.print("Input the second number here: ");
      int num2 = input.nextInt();

      System.out.print("Input the third number here: ");
      int num3 = input.nextInt();

      if (num1 > num2 && num1 > num3) {
        System.out.println(num1 + " is the largest number.");
      } else if (num2 > num1 && num2 > num3) {
        System.out.println(num2 + " is the largest number.");
      } else if (num3 > num1 && num3 > num2) {
        System.out.println(num3 + " is the largest number.");
      } else {
        System.out.println("All numbers are equal.");
      }

      input.close();
    }
}
