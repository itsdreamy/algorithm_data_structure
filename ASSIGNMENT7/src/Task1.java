public class Task1 {
    public static void main(String[] args) {
        int diff1 = 5;
        int result = 6;

        System.out.print(result + " ");

        for (int diff2 = -4; diff2 >= -10; diff2 -= 2) {
            result += diff2;
            System.out.print(result + " ");
            result += diff1;
            System.out.print(result + " ");            
            diff1 += 2;
        }
    }
}