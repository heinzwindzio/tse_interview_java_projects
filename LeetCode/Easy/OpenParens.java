import java.util.ArrayList;
import java.util.Arrays;

public class OpenParens {
    
    public static void main(String[] args){

        boolean answer=true;

        String brackets = "[[[]";
        // String brackets = "({()()})[()]";

        // Convert the array an ArrayList so we can remove brackets and adjust the index
        ArrayList<Character> parensList = new ArrayList<>();  
        
        for (char c : brackets.toCharArray()) {
            parensList.add(c);
        }

        // traverse through the brackets
        outerloop:
        for (int x=0; x<parensList.size(); x++){

            System.out.println("Entering loop. list size: " + parensList.size() + ". Index: " + x + ". char: " + parensList.get(x));
            for ( int y=0; y<parensList.size(); y++) {
                System.out.print(parensList.get(y));
            }
            System.out.println();

            // if only one left then false
            if (parensList.size() == 1){
                answer = false;
                break outerloop;
            }

            // if first position is a close then false
             if (x == 0) { 
                
                // get the value
                char first = parensList.get(x);
                
                // if first char is an close bracket, then false
                if (first == ')' || first == '}' || first == ']') {
                answer = false;
                break outerloop;
                }
            }

            // if last position is an open then false
            if (x == (parensList.size()-1)) { 
                
                // get the value
                char last = parensList.get(x);
                
                // if last char is an open bracket, then false
                if (last == '(' || last == '{' || last == '[') {
                answer = false;
                break outerloop;
                }
            }

            // Check for a close   
            switch (parensList.get(x)){

                case ')' :
                    // check the previous position for an open of same type.
                    if (parensList.get(x-1) == '('){

                        // if found, then remove the two from the list
                        parensList.remove(x);
                        parensList.remove(x-1);

                        // if there are 2 elements left in the list, set the index back 2 places
                        if( parensList.size() >=2 ){
                            x = x-2;
                        }
                        else if ( parensList.size() == 1){
                            System.out.println("Only one left in the list. We shouldn't be here");
                            answer = false;
                            break outerloop;
                        }
                    }
                    else { // check to see if it's an open of a different type
                        if ((parensList.get(x-1) == '{') || (parensList.get(x-1) == '[')){
                            answer = false;
                            break outerloop;
                        }
                    }
                    break;
                case '}' :
                    // check the previous position for an open of same type.
                    if (parensList.get(x-1) == '{'){

                        // if found, then remove the two from the list
                        parensList.remove(x);
                        parensList.remove(x-1);

                        // if there are 2 elements left in the list, set the index back 2 places
                        if( parensList.size() >=2 ){
                            x = x-2;
                        }
                        else if ( parensList.size() == 1){
                            System.out.println("Only one left in the list. We shouldn't be here");
                            answer = false;
                            break outerloop;
                        }
                    }
                    else { // check to see if it's an open of a different type
                        if ((parensList.get(x-1) == '(') || (parensList.get(x-1) == '[')){
                            answer = false;
                            break outerloop;
                        }
                    }
                    break;
                case ']' :
                    // check the previous position for an open of same type.
                    if (parensList.get(x-1) == '['){

                        // if found, then remove the two from the list
                        parensList.remove(x);
                        parensList.remove(x-1);

                        // if there are 2 elements left in the list, set the index back 2 places
                        if( parensList.size() >=2 ){
                            x = x-2;
                        }
                        else if ( parensList.size() == 1){
                            System.out.println("Only one left in the list. We shouldn't be here");
                            answer = false;
                            break outerloop;
                        }
                    }
                    else { // check to see if it's an open of a different type
                        if ((parensList.get(x-1) == '(') || (parensList.get(x-1) == '{')){
                            answer = false;
                            break outerloop;
                        }
                    }
                    break;
            } // end switch

            // after setting the index back 2, check to see if it's the last position in the list and an open bracket
            
            
        } // end for
        System.out.println("This is the answer: " + answer);

    }
}
