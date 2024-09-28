public class set {
    public static void main(String[] args) {


            int number = 5;  
            int position = 1;  
    
            int bit_mask = 1<<position;    
            
            int new_number = bit_mask | number ;
            System.out.println(new_number);
                
            }
    }
    

