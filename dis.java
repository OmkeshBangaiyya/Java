// import java.util.*;

// public class dis {
//     public static void main(String[] args) {
       
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter the size of columns");
//         int columns = sc.nextInt();

//         int [][] numbers = new int[rows][columns];

//         //input
//         //rows
//         for(int i=0;i<rows;i++){   
//             //columns
//             for(int j=0; j<columns;j++){
//                 System.out.println("Enter numbers :");
//                 numbers[i][j]= sc.nextInt();             
//             }      
            
//         //output
//         //rows
//         for(int i=0;i<rows;i++){   
//             //columns
//             for(int j=0; j<columns;j++){
//                 System.out.println(numbers[i][j] + " ");          
//             }  
//         }
//         System.out.println();
// }}}


import java.util.*;

public class Dis {  // Changed class name to 'Dis'
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the size of columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter numbers :");
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");  // Print inline
            }
            System.out.println();  // Move to the next line after each row
        }

        sc.close();  // Close the scanner
    }
}
