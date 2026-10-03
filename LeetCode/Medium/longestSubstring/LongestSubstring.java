public class LongestSubstring {
    

    public static void main(String[] args){

        //String s = "abcabcbb";"
        //String s = "bbbbb";
        String s = "pwwkew";

        LongestSubstring ls = new LongestSubstring();
        System.out.println("This is the longest substring: " +ls.lengthOfLongestSubstring(s));
    }

    /**
     * implements a sliding window
     */
    public int lengthOfLongestSubstring(String s) {
        
        int result = 0; // constraint includes a 0 length String
        int left = 0; // left pointer
        int right = 0; // right pointer

        int[] mapTable = new int[128]; // contains all letters as a key 

        // loop through each char in the String with the right index
        while(right < s.length()){

            // increment the count for each char in the map table
            mapTable[s.charAt(right)]++;

            // loop while we still have a count > 1 for that right index 
            while(mapTable[s.charAt(right)]>1){

                // decrease the count of that char in the map table by 1
                mapTable[s.charAt(left)]--;

                // move the left pointer up by 1
                left++;
            }

            // see if it's longer than the current length of a substring
            result = Math.max(result, right-left+1);

            // move the right index forward
            right++;
        }

        return result;
    }
}

