import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextInt();

        System.out.println("Enter your second number");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a and b is equal");
        } else if (a > b) {
            System.out.println("a is greater then b ");
        } else {
            System.out.println("b is greater then a ");
        }
        // else{
        // if(a>b){
        // System.out.println("a is greater then b ");
        // }
        // else {
        // System.out.println("b is greater then a ");
        // }
        // }
    }
}
