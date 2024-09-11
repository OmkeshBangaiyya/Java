import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();

        // Displaying operation choices
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");
        int operation = sc.nextInt();
        int result;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("a+b====" + result);
                break;
            case 2:
                result = a - b;
                System.out.println("a-b====" + result);
                break;
            case 3:
                result = a * b;
                System.out.println("a*b====" + result);
                break;
            case 4:
                result = a / b;
                System.out.println("a/b====" + result);
                break;
                case 5:
                result = a % b;
                System.out.println("a%b====" + result);
                break;    
            default:
                System.out.println("invalid opretion input");
                break;
        }
    }
}
