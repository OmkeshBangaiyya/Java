import java.util.*;

public class strBuild{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Character at index 0
        System.out.println(sb.charAt(0));

        //set a char p at 0 index
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        //insert a new values 
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete extra n
        sb.delete(2, 3);
        System.out.println(sb);


        //Append the words ata the end of string 
        StringBuilder sp = new StringBuilder("h");
        sp.append('e');
        sp.append('l');
        sp.append('l');
        sp.append('o');

        System.out.println(sp);
        
    }  
}
