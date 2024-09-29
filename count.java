// Question 
// Write a program to count the number of 1’s in a binary representation of the number.

public class count {
    public static int ones(int n) {
        int count = 0;

        // Loop until all bits are traversed
        while (n != 0) {

            // Check if the least significant bit is 1
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift the number by 1 to check the next bit
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Binary: 11101 (so there are 4 ones)

        int onesNo = ones(number);
        System.out.println("Number of 1's in binary representation: " + onesNo);
    }
}
