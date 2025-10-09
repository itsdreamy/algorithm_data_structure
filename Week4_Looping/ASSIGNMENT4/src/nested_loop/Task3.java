package nested_loop;

public class Task3 {
    public static void main(String[] args) {
        for(int rows = 1; rows <= 3; rows++) {
            for(int cols = 1; cols <= 3; cols++) {
                System.out.print(rows + " x " + cols + " = " + (rows * cols) + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}

// 1 x 1 = 1
// 1 x 2 = 2
// 1 x 3 = 3

// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6

// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9