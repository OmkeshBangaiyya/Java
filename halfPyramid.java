public class halfPyramid {
    public static void main(String[] args) {
        int n = 4;
        //Outer loop
        for(int i =1; i<=n;i++){
            //Inner loop  j--------->i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
