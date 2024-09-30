public class selectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}

// -----------------------------------------------------------------------------------------------------------------------------------

// public class SelectionSort {
//     // Function to print the array
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 3, 1, 2 };

//         // Selection Sort
//         for (int i = 0; i < arr.length - 1; i++) {  // Corrected to arr.length
//             int smallest = i;

//             // Find the smallest element in the unsorted part of the array
//             for (int j = i + 1; j < arr.length; j++) {  // Corrected to arr.length
//                 if (arr[smallest] > arr[j]) {
//                     smallest = j;
//                 }
//             }

//             // Swap the smallest element found with the first element of the unsorted part
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }

//         // Print the sorted array
//         printArray(arr);
//     }
// }

