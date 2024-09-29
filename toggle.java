// Question
// Write a program to toggle a bit a position = “pos” in a number “n”.

public class toggle {

    public static int togbit(int n , int pos) {
        int bitmask = 1<< pos;
        return bitmask | n ;
    }
    public static void main(String[] args) {
        // int num = 5; 
        // int position = 1;

        // int bitmask = 1<< position;

        // int tog = bitmask | num ;
        // System.out.println(tog);


        int num = 5; 
        int position = 1;

        int result = togbit(num, position);

        System.out.println("original number: " + num);
        System.out.println("toggle bit at bosition 1 is: "+ result);

    }
    
}
