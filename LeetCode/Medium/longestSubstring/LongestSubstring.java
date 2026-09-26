public class LongestSubstring {
    

    public static void main(String[] args){

        String s = "abcabcbb";
        LongestSubstring ls = new LongestSubstring();
        System.out.println("This is the longest substring: " +ls.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        
        int result = 0; // constraint includes a 0 length String

        // loop through each char in the String, creating a substring from that char
        for(int x = 0; x<s.length(); x++){

            int count = 1;
            int firstIndex = 0; // position of the first index of the duplicate char
            String compare = Character.toString(s.charAt(x));

            // create a new substring to search, without the compare char
            String temp = s.substring(x+1);
            System.out.println(temp);

            // search the temp String for the first index of the duplicate char
            firstIndex = temp.indexOf(compare);

            // if it exists, then count = index - 1
            if(firstIndex != -1){
                System.out.println(firstIndex); 
                count = firstIndex+1;
            }
            else{ // otherwise the count = temp.length()
                count = temp.length()+1;
            }

            // if the count is bigger than the result, then result = count
            if(count>result) result = count;

        } // end for
        return result;
    }
}

