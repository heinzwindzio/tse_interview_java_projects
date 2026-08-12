/**
 * 
 * 2 ways to call static methods - either call it from another static method, or instantiate an object and call it. 
 * */
 

public class Example {
    
    public static void main(String[] args){

        String word = myStaticMethod();
        System.out.println(word);

        Example staticE = new Example();
        String word2 = staticE.nonStaticMethod();
        System.out.println(word2);
    }

    public static String myStaticMethod(){
        return "I called a static method";
    }

    public String nonStaticMethod(){
        return "I called a non-static method";
    }
}
