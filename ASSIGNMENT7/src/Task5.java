import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ur name : ");
        String name = input.nextLine();
        name = name.toUpperCase();

        int count = name.length();

        for(int rows = 1; rows <= count; rows++){
            for(int cols = 0; cols < rows; cols++){
                System.out.print(name.charAt(cols) + " ");
            }
        System.out.println();
    }
}
}