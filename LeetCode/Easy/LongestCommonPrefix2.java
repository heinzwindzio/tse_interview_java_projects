import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestCommonPrefix2 {
    

    public static void main(String[] args){

        String[] words = {"flower","flow","flight"};

        String first = "";
        String second = "";
        String prefix = "";

        first = words[0];

        for (int x=1; x<words.length; x++){

            System.out.println("This is the first word: " + first);

            second = words[x];
            System.out.println("This is the second word: " + second);

            for (int z=0; (z<first.length()) && (z<second.length()); z++){
                if (first.charAt(z) == second.charAt(z)){
                    prefix = prefix + first.charAt(z);
                }
                else break;
            }

            first = prefix;

        }

        System.out.println("This is the prefix dude: " + prefix);
    }
}
