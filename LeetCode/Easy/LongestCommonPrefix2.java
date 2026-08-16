import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestCommonPrefix2 {
    

    public static void main(String[] args){

        String[] words = {"flower","flow","flight"};

        // the maximum letters that all words have in common
        int maxLetters = 0;

        String firstWord = words[0];
        String nextWord = "";

        // compare prefix against the rest of the words, subtracting from the max length as we go
        
        // loop through the array, starting with the second word
        for (int x=1; x<words.length; x++){

            // grab the next word
            nextWord = words[x];

            // loop through each letter in the current word
            for (int y=0; y <nextWord.length(); y++){

                // compare each letter in the current word with the next word, starting with the char at max length
                if (firstWord.charAt(y) == nextWord.charAt(y)){

                    // if a match then increase the max length by 1
                    maxLetters++;
                }
                else break;
            }   
        }


    }
}
