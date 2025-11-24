package session9;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "admin123";
        String password = "admin";
        int attempt = 1;
        boolean loop = true;

        do{
            System.out.print("Enter the username : ");
            String usn = input.nextLine();
            System.out.print("Enter the password : ");
            String pass = input.nextLine();

            if(usn.equals(username) && pass.equals(password)){
                System.out.println("Login Successful!");
                System.out.println("Welcome, " + username + "!");
                loop = false;
            }else{
                attempt++;
                loop = true;
                System.out.println("Username or password is wrong, try again!");
            }
            
            if(attempt > 3){
                System.out.println("Account Locked!");
            }
        }while(attempt <= 3 && loop == true);
    }
}
