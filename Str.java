import java.util.*;

public class Str {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name");
        // String name = sc.nextLine();
        // System.out.println("output of the str is: "+name);

        //Concatenation
        String Name  = "Tony";
        String Surname = "Stark";

        String fullName = Name + "@" + Surname ; 
        System.out.println(fullName);

        //String Length 
        System.out.println(fullName.length());

        //charAt()

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }


        //compare two strings by using (S1.compareTo(S2))
        String name1 ="Tony";
        String name2 = "Tony";

        if (name1.compareTo(name2)==0) {
            System.out.println("Strings are equal.");           
        }else{
            System.out.println("Strings are not equal.");
        }

        String sentence = "My name is Tony"; 
       
        //substring(beg index, end index) 
        
        String nameTwo = sentence.substring(11, sentence.length());
        System.out.println(nameTwo);
    }  
}
