package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Store{
    int no, price, qty, subtotal;
    String item;

    public Store(int no, String item, int price, int qty, int subtotal) {
        this.no = no;
        this.item = item;
        this.price = price;
        this.qty = qty;
        this.subtotal = qty * price;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <Store> products = new ArrayList<>();
        int itemNumber = 1;
        while(true){
            System.out.println("Masukkan data barang ke " + itemNumber + ": ");
            System.out.print("Masukkan nama barang : ");
            String itemName = input.nextLine();
            System.out.print("Masukkan harga barang : ");
            int itemPrice = input.nextInt();
            System.out.print("Masukkan jumlah barang : ");
            int itemQty = input.nextInt();

            input.nextLine();

            products.add(new Store(itemNumber, itemName, itemPrice, itemQty, itemPrice * itemQty));
            itemNumber++;

            System.out.println("Apakah anda ingin menambahkan barang lagi? (y/n)");
            String answer = input.nextLine();

            if(answer.equalsIgnoreCase("n")) break;
        }

        int grandtotal = 0;
        System.out.println("\nData Belanja");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-4s | %-15s | %-8s | %-4s | &-8s\n", "No", "Item", "Price", "Qty", "Subtotal");
        System.out.println("------------------------------------------------------------------");
        
        for(Store item:products){
            System.out.printf("%-4d | %-15s | %-8d | %-4d | %-8d\n", item.no, item.item, item.price, item.qty, item.subtotal);
            grandtotal += item.subtotal;
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total : " + grandtotal);
    }
}