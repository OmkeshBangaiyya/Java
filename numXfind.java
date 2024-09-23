import java.util.*;

public class numXfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int rows =sc.nextInt();
        System.out.println("Columns");
        int columns =sc.nextInt();

        int [][] numbers= new  int[rows][columns];

        int X = sc.nextInt(); //find number 

        //input
        //rows
        for(int i =0;i<rows;i++){
            //columns
            for(int j=0;j<columns;j++){
                System.out.println("Enter the number:");
                numbers[i][j]= sc.nextInt();
                if(numbers[i][j]==X){
                    System.out.println("The number X found at ("+ i + " ,"+j+ ")");
                }
            }
        }
        // Input the number to search
        // System.out.println("Enter the number to find:");
        // int X = sc.nextInt();

        // // Search for X in the 2D array
        // boolean found = false;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         if (numbers[i][j] == X) {
        //             System.out.println("Number " + X + " found at position: (" + i + ", " + j + ")");
        //             found = true;
        //         }
        //     }
        // }

        // if (!found) {
        //     System.out.println("Number " + X + " not found.");
        // }

    }
}
