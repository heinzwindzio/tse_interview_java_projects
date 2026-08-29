public class StringFirstOccurance {
    
    public static void main(String[] args){

        int result;
        //String s1 = "sadbutsad";
        //String s2 = "sad";
        String s1 = "leetcode";
        String s2 = "leeto";


        StringFirstOccurance sfo = new StringFirstOccurance();

        result = sfo.strStr(s1, s2);

        System.out.println("This is the result: " + result);


    }


    public int strStr(String haystack, String needle) {
        
        return haystack.indexOf(needle);
    }
}
