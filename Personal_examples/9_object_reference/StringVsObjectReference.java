public class StringVsObjectReference {
    
    public static void main(String[] args){

        String name = "Heinz";

        // points to the same object in memory
        String nickname = name;

        // Unlike Objects, Strings are immutable
        // So 'nickname' is not actually changing the value of the object
        // It is actually a new object reference
        nickname = "57";

        System.out.println("This is the name: " + name);
        System.out.println("This is the nickname: " + nickname);
    }
}
