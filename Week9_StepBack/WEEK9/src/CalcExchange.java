package session9;

import java.util.Scanner;

public class CalcExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the total amount : ");
        double total = input.nextDouble();
        input.nextLine();

        System.out.print("Input the payment amount : ");
        double payment = input.nextDouble();

        double exchange = (payment - total);

        System.out.println("\n------------------RESULT-----------------");
        System.out.println("Your total amount is : Rp. " + total);
        System.out.println("Your payment amount is : Rp. " + payment);
        System.out.println("Your exchange is : Rp. " + exchange);
    }
}
