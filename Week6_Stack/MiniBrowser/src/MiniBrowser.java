import java.util.Scanner;
import java.util.Stack;

public class MiniBrowser{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "1";
        Stack <String> links = new Stack<>();

        
        do{
            System.out.println("\n1. Enter the url");    
            System.out.println("2. Back to previous url");    
            System.out.println("3. Show the current url");    
            System.out.println("4. Show the history of the urls visited");    
            System.out.println("5. Exit the program");
            System.out.print("Enter ur choice (1-5) : ");
            answer = input.nextLine();
            if(answer.equals("1")){
                System.out.print("Enter url : ");
                String url = input.nextLine();
                links.push(url);
            }else if(answer.equals("2")){
                if(links.size() > 1){
                    links.pop();
                    System.out.println("Current url is " + links.peek());
                } else{
                    System.out.println("No way back to previous url");
                }
            } else if(answer.equals("3")){
                if(!links.isEmpty()){
                    System.out.println("Current url is : " + links.peek());
                } else {
                    System.out.println("No current URL. History is empty.");
                }
            } else if(answer.equals("4")){
                if(!links.isEmpty()){
                    System.out.println(links);
                } else {
                    System.out.println("History is empty.");
                }
            } else if(answer.equals("5")){
                boolean confirmedexit = false;

                System.out.println("You...You're leaving already? (y/n)");
                String exit = input.nextLine();

                if(exit.equalsIgnoreCase("y")){
                    System.out.println("But...what about all the urls we've visited?.. Are they just... data to u?? (y/n)");
                    exit = input.nextLine();

                    if (exit.equalsIgnoreCase("y")) {
                        System.out.println("Fine..I see how it is... But, Are u absolutely..100% sure??? (y/n)");    
                        exit = input.nextLine();
                        
                        if (exit.equalsIgnoreCase("y")) {
                            confirmedexit = true;
                        }
                    }
                }

                if(!confirmedexit){
                    System.out.println("OMG U R STAYING!!!!");
                    answer = "0";
                }
            }else{
                System.out.println("Invalid choice, please enter 1-5");
            }
        }
        while(!answer.equals("5"));
        
        System.out.println("Bye bye <3");
        input.close();
    }
}