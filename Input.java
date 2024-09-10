// import java.util.*;

// public class Input {
// public static void main (String[] args){
//     Scanner sc = new Scanner(System.in);


//     // next() function gives single word as output 
//     String name = sc.next();

//     // if we have to print all the line as a output then we used nextLine()
//     String name = sc.nextLine();

//     System.out.println(name);
// }
// }


import java.util.*;

public class Input {
    public static void main(String[] args){

Scanner z = new Scanner(System.in);
 
System.out.println("Enter first number:");
int a = z.nextInt();

System.out.println("Enter second number:");
int b = z.nextInt();

int x = a + b;
System.out.println(x);
    }
}