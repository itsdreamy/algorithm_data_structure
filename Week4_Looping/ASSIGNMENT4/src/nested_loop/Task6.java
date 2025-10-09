package nested_loop;

public class Task6 {
    public static void main(String[] args) {
        int n = 9;
        int a = 0, b = 0, c = 1;

        System.out.print(a + " " + b + " " + c);
        for (int i = 2; i < n; i++) {
            int next = a + b + c;
            System.out.print(" " + next);
            a = b;
            b = c;
            c = next;
        }
    }
}

// 0 0 1 1 2 4 7 13 24 44
