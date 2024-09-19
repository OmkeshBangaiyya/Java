import java.util.Scanner;

public class multiply {
    public static int multi(int a ,int b) {
        // int multiple = a*b;
        return a*b;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int M = multi(a, b);
        // System.out.println("Multiplication value of two number is:" + M);

        System.out.println("Multiplication value of two number is:" + multi(a, b));
    }
}
