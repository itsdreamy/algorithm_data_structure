public class Task2 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 8; cols++) {
                if ((rows + cols) % 2 == 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}