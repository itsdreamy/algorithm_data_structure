package Basic;

public class BasicExponential {
    public static int exponential(int power, int n) {
        if (power < 1) {
            return 1;
        } else {
            return n * exponential(power - 1, n);
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int power = 16;
        System.out.println("The result of " + n + " to the power of " + power + " is " + exponential(power, n));
    }
}