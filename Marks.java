
public class Marks {
    public static void main(String[] args) {

        int[] mark = new int[3];
        // orr int mark[] = new int[3]; we can write[] either next to the array type or
        // next to the array name

        // orrr int mark[]= {98,96,99}; if we know the size of an array then only we can
        // write
        mark[0] = 98; // physics
        mark[1] = 96; // chem
        mark[2] = 99; // english

        // System.out.println(mark[0]);
        // System.out.println(mark[1]);
        // System.out.println(mark[2]);

        for (int i = 0; i < mark.length; i++) { // i < mark.length orrr i<3
            System.out.println(mark[i]);
        }
    }
}
