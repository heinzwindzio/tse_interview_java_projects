public class ArrayAsAMap {
    public static void main(String[] args) {
        
        // ASCII for lower case is 97 ('a') to 122 ('z')
        // Use ASCII for the index value
        // so this pulls in all the characters up to ASCII 122 we can use as an index
        // this creates an array of Strings with max 123 elements, each can have it's own ASCII value
        String[] nicknameMap = new String[123]; 
        
        // Put data into the "map" using char indices
        nicknameMap['a'] = "Alice";
        nicknameMap['b'] = "Bob";

        nicknameMap[3] = "Charlie";
        
        // Get data out of the "map"
        System.out.println(nicknameMap['a']); // Outputs: Alice
        System.out.println(nicknameMap[97]); // Outputs: Alice

        System.out.println(nicknameMap[3]); // Outputs: Charlie

        nicknameMap['z'] = "Zed";
        System.out.println(nicknameMap['z']); // Outputs: Zed
        System.out.println(nicknameMap[122]); // Outputs: Zed

        nicknameMap['!'] = "WOW";
        System.out.println(nicknameMap['!']); // Outputs: WOW
        System.out.println(nicknameMap[33]); // Outputs: WOW
    

        /**
         * Can also shift the indexes so that you're not wasting memory
         */
        String[] words = new String[26]; // 26 letters in the alphabet
        
        char key = 'c'; // ASCII value 99
        
        // 'a' ASCII value = 97
        // 99 - 97 = 2
        words[key - 'a'] = "newWord"; 
        
        // Can't really put the ASCII value here for '2'
        System.out.println(words[2]); // Outputs: newWord
        
    }
}