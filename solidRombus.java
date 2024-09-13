public class solidRombus {
    public static void main(String[] args) {
        int n = 5;

        // outer row
        for (int i = 0; i < n; i++) {
            // speces print
            int speces = n - i;
            for (int j = 0; j < speces; j++) {
                System.out.print(" ");
            }

            // star print
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}