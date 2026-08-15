import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestCommonPrefix {
    
    public static void main(String[] args){

        String output;

        LongestCommonPrefix lCP = new LongestCommonPrefix();
        
        output = lCP.longestCommonPrefix(new String[]{"flower","flow","flight","flowing"});
        System.out.println(output);

        output = lCP.longestCommonPrefix(new String[]{"dog","racecar","car"});
        System.out.println(output);
    }

    public String longestCommonPrefix(String[] strs) {
        
        String firstString = "";
        String secondString = "";
        String prefix = "";

        List<String> linkedPrefixes = new ArrayList<>();

        // loop through each string in the array
        for (int x=0; x<strs.length; x++){ 
            
            firstString = strs[x];
            System.out.println("This is the first string: " + firstString);

            // loop through the rest of the strings in the array
            for (int y=x+1; y<strs.length; y++){

                secondString = strs[y];
                System.out.println("This is the second string: " + secondString);
            
                // compare the two strings, char by char
                for (int z=0; (z<firstString.length()) && (z<secondString.length()); z++){ 
                    
                    // if the chars match, then build a prefix
                    if (firstString.charAt(z) == secondString.charAt(z)){
                        prefix = prefix + firstString.charAt(z);
                    }
                    else break; // break out of the loop
                }
                linkedPrefixes.add(prefix); // add the prefix to the List
                prefix = ""; // reset the prefix
            }
        }

        // Find the longest string
        Optional<String> longest = linkedPrefixes.stream().max(Comparator.comparingInt(pre -> pre.length()));
        // Optional<String> longest = linkedPrefixes.stream().max(Comparator.comparingInt(String::length());

        return longest.get();
    }
}
