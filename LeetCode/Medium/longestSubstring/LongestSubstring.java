public class LongestSubstring {
    

    public static void main(String[] args){

        String s = "bbbbb";
        LongestSubstring ls = new LongestSubstring();
        System.out.println("This is the longest substring: " +ls.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        
        int result = 0; // constraint includes a 0 length String

        // loop through each char in the String, creating a substring from that char
        for(int x = 0; x<s.length(); x++){

            int count = 1;

            // put the first char in a String of unique chars
            String unique = Character.toString(s.charAt(x));

            // create a new substring to search, starting with the current char
            String temp = s.substring(x);

            // search the temp String for the char
            // if not there, increment the count and put the char in the String
            if( !unique.contains(Character.toString(temp.charAt(y))) ){
                count++;
                unique = unique + s.charAt(y);
            }
            else break; // otherwise break out of this loop


            // if the count is bigger than the result, then result = count
            if(count>result) result = count;

        } // end for
        return result;
    }
}

