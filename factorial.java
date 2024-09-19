import java.util.Scanner;

public class factorial {

    // public static int  fact(int num) {
    //     int z = 1;
    //     for(int i = num ;i>=1;i--){
    //         z = z *i;
    //     }
    //     return z;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();

    //     System.out.println(fact(num));
    // }


    public static void  fact(int num) {

            if(num==0){
                System.out.println("1");
                return;
            }else if(num<0){
                System.out.println("invailed factorial");
                return;
            }
            int z = 1;

            for(int i = num ;i>=1;i--){
                z = z *i;
            }
            System.out.println(z);
            return ;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number");
            int num = sc.nextInt();
    
            fact(num);
        }
}
