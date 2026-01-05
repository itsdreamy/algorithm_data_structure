package Basic;

public class BasicFIbonacci {
    public static void main(String[] args) {
        System.out.print("0, 1, ");
        fibonacci(0, 1, 9, 2);
    }

    public static void fibonacci(int n1, int n2, int index, int count) {
        if (count < index) {
            int newNumber = n1 + n2;
            System.out.print(newNumber + ", ");
            fibonacci(n2, newNumber, index, ++count);
        }
    }

}
