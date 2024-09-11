public class hollowReactangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
//outer loop contain println
        for (int i = 1; i <= n; i++) {
            //inner loop contain print
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
