//check the age of a person if ahe greater then 18 print adult otherwise print child 


import java.util.Scanner;

public class age {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");

        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are adult.");
        }
        else{
            System.out.println("You are child.");
        }

    }
}
