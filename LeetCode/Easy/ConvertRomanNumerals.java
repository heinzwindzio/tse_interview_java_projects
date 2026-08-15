/**
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, 
the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle 
applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/


public class ConvertRomanNumerals {

        public static void main(String[] args){
            
            ConvertRomanNumerals obj = new ConvertRomanNumerals();
            System.out.println(obj.romanToInt("III")); // 3
            System.out.println(obj.romanToInt("XXVII")); // 27
            System.out.println(obj.romanToInt("IV")); // 4
            System.out.println(obj.romanToInt("MCMXCIV")); // 1994 
            
        }

        public int romanToInt(String s) {
        
            int prevNumber = 0;
            int number = 0;
            int romanNumber = 0;

            for (int x=0; x<s.length(); x++){

                char c = s.charAt(x);
                switch (c) {
                    case 'I' : number = 1; break;
                    case 'V' : number = 5; break;
                    case 'X' : number = 10; break;
                    case 'L' : number = 50; break;
                    case 'C' : number = 100; break;
                    case 'D' : number = 500; break;
                    case 'M' : number = 1000; break;
                }

                if (prevNumber == 0){
                    romanNumber = number;
                }
                else{
                    if (prevNumber < number){ // we need to subtract
                        romanNumber = romanNumber - prevNumber + (number - prevNumber);
                    }
                    else{ // we add
                        romanNumber = romanNumber + number;
                    }
                }
                prevNumber = number;
            }

            return romanNumber;
        }
}
