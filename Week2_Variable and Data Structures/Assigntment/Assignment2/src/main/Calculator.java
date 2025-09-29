package main;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class Calculator{
    public static void main(String[] args) {
        //initialize variables
        double price = 19.99;
        int qty = 3;
        double taxRate = 0.11;

        double subtotal = price * qty;
        double total = subtotal * taxRate;

        System.out.println("Raw total (double): " + total);
        
    }
}