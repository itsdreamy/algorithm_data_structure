import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        String choice;

        do{
            System.out.print("Add a number : ");
            int num = input.nextInt();
            
            if(num < min) min = num;
            if(num > max) max = num;

            sum += num;
            count++;

            System.out.print("Add more number? (y/n) : ");
            input.nextLine();
            choice = input.nextLine();
        } while(choice.equalsIgnoreCase("y"));

        double average = (double) sum / count;

        System.out.println("============RESULT============");
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The sum of total value is " + sum);
        System.out.println("The average is " + average);
    }
}