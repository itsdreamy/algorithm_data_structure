package main;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class CalculatorMain {
    public static void main(String[] args) {
        // initialize variables
        BigDecimal item_price = new BigDecimal("0.00");
        int quantity;
        BigDecimal tax_rate = new BigDecimal("0.11");

        // get the user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item price: ");
        item_price = input.nextBigDecimal();
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        // calculate the total cost
        BigDecimal subtotal = item_price.multiply(new BigDecimal(quantity));
        BigDecimal tax = subtotal.multiply(tax_rate);
        BigDecimal total = subtotal.add(tax);

        // rounding up the output
        subtotal = subtotal.setScale(2, RoundingMode.HALF_UP);
        tax = tax.setScale(2, RoundingMode.HALF_UP);
        total = total.setScale(2, RoundingMode.HALF_UP);

        // output
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (11%): $" + tax);
        System.out.println("Total: $" + total);

    }
}
