import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a size of an array");
        int size=sc.nextInt();

        int numbers[] = new int[size];

        for(int i =0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
    
}
