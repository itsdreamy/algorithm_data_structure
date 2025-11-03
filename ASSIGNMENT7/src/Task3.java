public class Task3 {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= 6; cols++) {
                if (cols <= rows) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}