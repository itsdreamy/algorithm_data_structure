import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StoreQueue {
    int no, price, qty, subtotal;
    String item;

    public StoreQueue(int no, String item, int price, int qty) {
        this.no = no;
        this.item = item;
        this.price = price;
        this.qty = qty;
        this.subtotal = qty * price;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue<StoreQueue> products = new LinkedList<>();
        int itemNumber = 1;

        while (true) {
            System.out.println("Masukkan data barang ke " + itemNumber + ": ");
            System.out.print("Masukkan nama barang : ");
            String itemName = input.nextLine();
            System.out.print("Masukkan harga barang : ");
            int itemPrice = input.nextInt();
            System.out.print("Masukkan jumlah barang : ");
            int itemQty = input.nextInt();

            input.nextLine(); 

            products.offer(new StoreQueue(itemNumber, itemName, itemPrice, itemQty));
            itemNumber++;

            System.out.println("Apakah anda ingin menambahkan barang lagi? (y/n)");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("n"))
                break;
        }

        if (!products.isEmpty()) {
            System.out.println("\nThe first item that you entered: " + products.peek().item);
        }
        
        int grandtotal = 0;
        System.out.println("\nData Belanja (Queue - FIFO)");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-4s | %-15s | %-8s | %-4s | %-8s\n", "No", "Item", "Price", "Qty", "Subtotal");
        System.out.println("------------------------------------------------------------------");
        
        while (!products.isEmpty()) {
            StoreQueue item = products.poll(); 
            
            System.out.printf("%-4d | %-15s | %-8d | %-4d | %-8d\n", item.no, item.item, item.price, item.qty,
                    item.subtotal);
            grandtotal += item.subtotal;
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Total : " + grandtotal);
        
        input.close();
    }
}