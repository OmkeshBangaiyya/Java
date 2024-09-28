public class clear {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;

        int bit_mask = 1<<position;

        //NOT of bitmask

        int not_bitmask = ~(bit_mask);
        int new_number = not_bitmask & n ; 

        System.out.println(new_number);
    }
    
}
