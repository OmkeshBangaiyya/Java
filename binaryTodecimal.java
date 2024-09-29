public class binaryTodecimal {
    // Function to convert a decimal number to binary
    public static String decimalToBinary(int decimal) {
        // Edge case: If the decimal number is 0
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        
        // Convert decimal to binary
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);  // Prepend the remainder to the binary string
            decimal = decimal / 2;
        }

        return binary.toString();
    }

    // Function to convert a binary number (as string) to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        // Convert binary to decimal
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                // Update decimal value by adding 2^(position of the bit)
                decimal += Math.pow(2, length - i - 1);
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        // Example usage
        int decimalNumber = 29;
        String binaryNumber = "11101";

        // Convert decimal to binary
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " to binary: " + binaryResult);

        // Convert binary to decimal
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Binary " + binaryNumber + " to decimal: " + decimalResult);
    }
}
