package nested_loop;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 0, c = 1;

        for (int i = 0 ; i < n ; i ++){
            System.out.print(a + " ");
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
    }
}

// 0 0 1 1 2 4 7 13 24 44
