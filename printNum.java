public class printNum{
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");  
        printNumber(n-1);    
    }
    public static void main(String[] args) {
        int m = 5;
        printNumber(m);
    }
}