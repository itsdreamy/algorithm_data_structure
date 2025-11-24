package session9;

import java.util.Scanner;

public class ExchangeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the total amount : ");
        double total = input.nextDouble();
        input.nextLine();

        System.out.print("Input the payment amount : ");
        double payment = input.nextDouble();
        input.nextLine();

        double discount = 0;

        if(total > 50000){
            discount = 0.1 * total;
        }
        
        if(total > 200000){
            discount = 0.2 * total;
        }

        double totalExchange = payment - (total - discount);

        System.out.println("\n---------------RESULT----------------");
        System.out.println("Your subtotal is : Rp. " + total);
        System.out.println("Your discount is : Rp. " + discount);
        System.out.println("Your total amount is : Rp. " + (total-discount));
        System.out.println("Your payment amount is : Rp. " + payment);
        System.out.println("Your exchange is : Rp. " + totalExchange);
    }
}
