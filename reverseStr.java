public class reverseStr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length()/2; i++) {
            
            //calculate the index
            int front = i;
            int back = sb.length()-1-i;

            //front and back character found using charAt()
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            //flip the front character at back and back at front 
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    
}
