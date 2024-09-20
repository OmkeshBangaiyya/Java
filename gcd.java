import java.util.Scanner;

public class gcd {
    public static int abc(int a ,int b){
        int c = a % b;
        while (c!=0) {
            a = b;
            b = c;
            c =  a % b;          
        }
        return b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number :");
        int num2 = sc.nextInt();

        System.out.println("The GCD of x "+num1+"and y "+num2+ "is " +abc(num1,num2));
    }    
}


// Euclid's Algorithm:

// 1. Start with two numbers a and b.
// 2. Replace a with b and b with the remainder when a is divided by b.
// 3. Repeat this process until b becomes zero.
// 4. The GCD is the value of a at that point.


// gcd(int a, int b):

// 1. The function takes two integers a and b.
// 2. The loop runs until b becomes 0. At each iteration, a is replaced with b, and b is replaced with the remainder a % b.
// 3. When b becomes 0, the GCD is stored in a.