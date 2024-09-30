//Bubble Sort 
//Time complexity = O(n^2)

public class bubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Bubble sort implementation

        for (int i = 0; i < arr.length - 1; i++) { // (arr.length - 1) means array length -1 (n-1)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}