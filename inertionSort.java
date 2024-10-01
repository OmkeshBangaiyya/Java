import java.util.*;

class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 1, 3, 2 };

        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}
// Insertion Sort Explanation:

// Insertion Sort is a simple sorting algorithm that builds the sorted array (or list) one item at a time. It works similarly to sorting playing cards in your hands. The algorithm divides the array into a "sorted" and an "unsorted" part. Initially, the first element is considered sorted, and then each subsequent element is inserted into its correct position within the sorted part.

// Steps of Insertion Sort:

// Assume the first element is already sorted.
// Take the next element and compare it with the elements in the sorted part (starting from the rightmost element).
// Shift all larger elements in the sorted part to the right to make room for the current element.
// Insert the current element into its correct position.
// Repeat until the entire array is sorted.


// Time Complexity of Insertion Sort Algorithm:
// Best Case: O(N)

// The best-case time complexity of Insertion Sort occurs when the input array is already sorted.
// In this scenario, each element is compared with its preceding elements until no swaps are needed, resulting in a linear time complexity.
// Therefore, the best-case time complexity is O(N), where n is the number of elements in the array.
// Average Case: O(N2)

// The average-case time complexity of Insertion Sort is also O(N2).
// This complexity arises from the nature of the algorithm, which involves pairwise comparisons and swaps to sort the elements.
// Although the exact number of comparisons and swaps may vary depending on the input, the average-case time complexity remains quadratic.
// Worst Case: O(N2)

// The worst-case time complexity of Insertion Sort occurs when the input array is in reverse sorted order.
// In this scenario, each element needs to be compared and possibly swapped with every preceding element, resulting in a quadratic time complexity.
// Therefore, the worst-case time complexity is O(N2), where n is the number of elements in the array.
