public class get{
    public static void main(String[] args) {
               // set bit at position 1 is zero to 1
               int number = 5;
               int position = 2;
       
               int bit_mask = 1 << position;    
               //we have to shift 1 by position 2
               // _ _ _ 1 _ _ _
               //1 0 0 0 ==bit mask
       
               //check 
               // bit_mask & number
               //  0 1 0 0  & 0 1 0 1
               //0 1 0 0 means  bit at position 2 is 1
       
               if ((bit_mask & number)==0) {
                   System.out.println("the bit at posiyion = " + position+" is Zero.");           
               }else{
                   System.out.println("the bit at posiyion = " + position+" is one.");
    }
}
