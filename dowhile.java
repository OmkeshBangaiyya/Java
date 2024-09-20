//Write an infinite loop using do while condition.

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;

    do {
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
    } while (a>=0&&b>=0);

    System.out.println("your addition of two number is"); // this line executed when while condition is satisfied 
    }
}
