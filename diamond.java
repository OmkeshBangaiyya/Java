public class diamond {
        public static void main(String[] args){
            int n = 4;
            for(int i =1; i<=n;i++){
                //spaces 
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            // Lower part of the diamond
            for (int i = n - 1; i >= 1; i--) {
                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }}
    
        









    