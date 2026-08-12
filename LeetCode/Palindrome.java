import java.lang.Integer;


class Palindrome {

    public static void main(String[] args){
        System.out.println("121: " + isPalindrome(121));
        System.out.println("123: " + isPalindrome(123));
        System.out.println("12321: " + isPalindrome(12321));

    }

    public static boolean isPalindrome(int x) {

        System.out.println("This is the int: " + x);

        String xString = Integer.toString(x);

        char[] chars = xString.toCharArray();

            
        for (int z=0; z<chars.length; z++){

            System.out.println("This is z: " + chars[z] + " and this is chars[chars.length-(z+1)]: " + chars[chars.length-(z+1)] );

            if (chars[z] != chars[chars.length-(z+1)] ){
                return false;
            }
        }

        return true;

    }
}