package nested_loop;

public class Task1 {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 4; rows++) {
            for(int cols = 1; cols <= 8; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5 6 7 8

// 1 2 3 4 5 6 7 8

// 1 2 3 4 5 6 7 8

// 1 2 3 4 5 6 7 8