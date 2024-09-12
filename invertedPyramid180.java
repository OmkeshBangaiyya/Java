public class invertedPyramid180 {
    public static void main(String[] args) {
        int n = 4;

        // outer loop -------------> row
        for (int i = 1; i <= n; i++) {

            // inner loop---------------->spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop----------->stars*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
