import java.util.Scanner;

public class Function {
    public static int printMyName(int i,int j){
        int sum = i+j;     
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();

        int i = sc.nextInt();
        int j = sc.nextInt();
        
        int sum = printMyName(i, j);
        System.out.println("Sum of 2 number is :" + sum); 
    }
    
}