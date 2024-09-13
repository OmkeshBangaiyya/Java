public class floyds {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
    
        // outerloop
        for(int i = 1; i<=n; i++){
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
        } 
    }
    }



// public class floyds {
//     public static void main(String[] args) {
//         int n = 5;  // Number of rows
//         int number = 1;  // Starting number

//         // Outer loop for the number of rows
//         for (int i = 1; i <= n; i++) {
//             // Inner loop for printing numbers in each row
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();  // Move to the next line after each row
//         }
//     }
// }