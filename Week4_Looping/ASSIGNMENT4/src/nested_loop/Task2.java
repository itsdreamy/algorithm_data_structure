package nested_loop;

public class Task2 {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 3; rows ++) {
            for(int cols = rows; cols <= 12 + rows; cols += 2) {
                System.out.print(cols + " ");
            }
            System.out.println();

        }
    }
}

// 1 3 5 7 9 11 13

// 2 4 6 8 10 12 14

// 3 5 7 9 11 13 15