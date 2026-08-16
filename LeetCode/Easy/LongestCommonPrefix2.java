import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestCommonPrefix2 {
    

    public static void main(String[] args){

        String[] strs = {"abab","aba",""};

        System.out.println("These are the words: ");
        for (String word : strs) System.out.println(word);

        String prefix = strs[0]; // assume the first word is the prefix which we compare to
        String nextWord = "";
        int index = 0;

        // handle case where only 1 word in the array - don't loop
        if (strs.length == 1){ 
            prefix = strs[0];
        }
        else{ // case where there is more than one word in the array

            outerloop:
            // loop through the array, starting with the second word
            for (int x=1; x<strs.length; x++){

                nextWord = strs[x];

                // handle case where either of the lengths are zero, then break out of loops
                if ((prefix.length() == 0) || (nextWord.length() == 0)){
                    System.out.println("one of the 2 words are empty strings");
                    prefix = "";
                    break outerloop;
                }

                // loop through each letter in the shortest word
                for (int y=0; y<prefix.length() & y<nextWord.length(); y++){

                    // handle a mismatch
                    if (prefix.charAt(y) != nextWord.charAt(y)){ 
                        System.out.println("there is a mismatch");

                        // handle where no chars match
                        if (y==0){
                            System.out.println("No common prefix letters found. Break out with no value");
                            prefix = "";
                            break outerloop;
                        }
                        else{ // handle a mismatch within the two strings
                            System.out.println("We found a mismatch at position: " + y);
                            prefix = prefix.substring(0, y); // set prefix up to that point
                            break; // break but keep comparing against other words in the array
                        }
                    }
                    // grab the index
                    index = y;
                }   
                // handle case where second word is shorter
                prefix = prefix.substring(0, index+1); 

            }
        }

        System.out.println("This is prefix: " + prefix);
    }
}
