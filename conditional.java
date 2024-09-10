import java.util.Scanner;

//Check wheather given number is even or odd 

//we can check odd even number by using any  of the following condition 

//if number is devisible by 2 and remainder is 0 then given number is even
//condition (Number % 2 = 0)

//If number is not divisible by 2 or remainder is 0 the given number is odd number 
//condition (Number % 2 = 1)

public class conditional {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");

        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }
}
