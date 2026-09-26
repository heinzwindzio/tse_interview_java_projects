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

            // create a temp String 
            String temp = s.substring(x);
            String unique = Character.toString(s.charAt(x));
            int count = 1;

            // for each char, start looping through subsequent chars
            for(int y=x+1; y<s.length(); y++){

                // search the temp String for the char
                // if not there, increment the count and put the char in the String
                if( !unique.contains(Character.toString(s.charAt(y))) ){
                    count++;
                    unique = unique + s.charAt(y);
                }
                else break; // otherwise break out of this loop

            } // end for

            // if the count is bigger than the result, then result = count
            if(count>result) result = count;

        } // end for
        return result;
    }   
}


