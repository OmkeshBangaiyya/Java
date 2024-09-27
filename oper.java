public class oper {
    public static void main(String[] args) {
        
        //Post increment
        int a = 10;
        int b = 0;

        b = a++;

        System.out.println(a);
        System.out.println(b);

        
        //Pre increment
        int c = 10;
        int d = 0;

        d = ++c;

        System.out.println(c);
        System.out.println(d);

// ------------------------------------------------------------------------------------------------------------------------------

        //Pre Decrement 
        int e = 10;
        int f = 0;

        f = --e;

        System.out.println(e);
        System.out.println(f);

        //Post Decrement 
        int g = 10;
        int h = 0;

        h = g--;

        System.out.println(g);
        System.out.println(h);
    }
    
}
