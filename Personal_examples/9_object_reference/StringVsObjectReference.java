public class StringVsObjectReference {
    
    int number = 57;
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

        StringVsObjectReference sor = new StringVsObjectReference();
        StringVsObjectReference sor2 = sor;
        sor2.number = 58;
        System.out.println("This is the number for sor: " + sor.number);
        System.out.println("This is the number for sor2: " + sor2.number);

    }
}
