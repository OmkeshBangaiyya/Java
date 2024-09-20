
import java.util.*;

public class powerNumber {

    public static int power(int x, int n) {
        int result =1;
        for(int i=0;i<n;i++){
            result *=x ;
        } 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //x value
        System.out.println("Enter the value of x");
        int x= sc.nextInt();
        
        //y value 
        System.out.println("Entre the value of y");
        int n=sc.nextInt() ;

        System.out.println("The value of power of x" + x + " raised to n" + n + " is " + power(x,n) );
    }

}
