public class update {
    public static void main(String[] args) {
        // for 1
        int number = 5;
        int position = 2;

        int bit_mask = 1 << position;

        int new_number = bit_mask | number;
        System.out.println(new_number);

        // for 0

        // NOT of bitmask

        int not_bitmask = ~(bit_mask);
        int new_number1 = not_bitmask & n;

        System.out.println(new_number1);

    }

}
