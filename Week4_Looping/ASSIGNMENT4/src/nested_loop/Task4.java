package nested_loop;

public class Task4 {
    public static void main(String[] args) {
        for(int rows = 1; rows <= 8; rows++) {
            for(int cols = rows; cols <= 8; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5 6 7 8 
// 2 3 4 5 6 7 8 
// 3 4 5 6 7 8 
// 4 5 6 7 8 
// 5 6 7 8 
// 6 7 8 
// 7 8 
// 8 