import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String text = input.nextLine();

        String cleanText = text.toLowerCase();

        String reversed = new StringBuilder(cleanText).reverse().toString();

        if (cleanText.equals(reversed)) {
            System.out.println(text + " is palindrome.");
        } else {
            System.out.println(text + " is not palindrome.");
        }

        input.close();
    }
}
