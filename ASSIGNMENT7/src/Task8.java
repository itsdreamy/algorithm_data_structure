import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        usernames.add("budi");
        passwords.add("budi123");

        usernames.add("siti");
        passwords.add("siti456");

        usernames.add("andi");
        passwords.add("andi789");

        usernames.add("nina");
        passwords.add("nina000");

        usernames.add("agus");
        passwords.add("agus999");

        System.out.print("Enter username: ");
        String userInput = input.nextLine();

        System.out.print("Enter password: ");
        String passInput = input.nextLine();

        boolean isValid = false;
        for (int i = 0; i < usernames.size(); i++) {
            if (userInput.equals(usernames.get(i)) && passInput.equals(passwords.get(i))) {
                isValid = true;
                break;
            }
        }

        if (isValid) {
            System.out.println("Username and password valid, you can login into the dashboard.");
        } else {
            System.out.println("Wrong username and password.");
        }

        input.close();
    }
}
