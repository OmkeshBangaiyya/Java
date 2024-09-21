//Take an array as input from the user. 
//Search for a given number x and print the index at which it occurs.

//Linear search

// import java.util.Scanner;

// public class numberSearching {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of a array");
//         int size = sc.nextInt();

//         int num[] = new int[size];

//         for(int i =0;i<size;i++){
//             System.out.println("Enter a number according to size of an array");
//             num[i] = sc.nextInt();
//         }

//         System.out.println("Enter a number of x");
//         int x = sc.nextInt();

//         for(int i =0;i<num.length;i++){
//             if(num[i]==x){
//                 System.out.println("x found at the index of "+ i);
//             }
//         }
//     }  
// }

// -----------------------------------------------------------------------------------------------------------------------

// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class numberSearching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of a array ");
        int size = sc.nextInt();

        String name[] = new String[size];

        //take a name as input
        for(int i =0;i<size;i++){

            System.out.println("Enter a name ");
            name[i]=sc.nextLine();
        }

        //output
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}