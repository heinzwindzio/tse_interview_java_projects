public class LengthLastWord {
    
    public static void main(String[] args){

        //String s = "H     ";
        //String s = "Hello World you are my oyster   ";
        //String s = "oyster";
        String s = "    oyster ";

        LengthLastWord llw = new LengthLastWord();

        System.out.println("This is the length of the last word:" + llw.lengthOfLastWord(s));
    }


    public int lengthOfLastWord(String s) {
        
        int lastLength=0;
        int lastIndex=s.length()-1;
        char c;
        boolean endBuffer = true;

        System.out.println("This is the string: " + s);

        // keep moving back until we find a non-space char
        for (int x=lastIndex; x>=0; x--){
            
            // grab the char
            if (s.charAt(x) != ' '){
                endBuffer = false;
                lastLength++;
            }

            if ( (s.charAt(x) == ' ') && (endBuffer == false) ){
                break;
            }
        }

        return lastLength;
    }
}
