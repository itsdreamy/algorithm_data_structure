package Basic;

import java.util.Scanner;

public class CountofDigits {
    public static int count(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 1 + count(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = input.nextInt();
        input.close();
        System.out.print("Digits in " + num + " is " + count(num));
    }

}
