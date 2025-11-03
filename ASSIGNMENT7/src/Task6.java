import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the item quantity : ");
        int qty = input.nextInt();

        int price = 20000;

        int discount = 0;

        if(qty >= 1){
            if(qty > 10){
                discount = (qty / 10) * 5;
                if(discount > 50){
                    discount = 50;
                }
            }

            double subtotal = qty * price * (discount/100.0);
            double total = (qty * price) - subtotal;

            System.out.println("RECEIPT");
            System.out.println("Quantity: " + qty);
            System.out.println("Price per item: Rp." + price);
            System.out.println("Subtotal: Rp." + qty * price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total: Rp." + total);
        }else{
            System.out.println("Invalid input");
        }
        input.close();
    }
}
