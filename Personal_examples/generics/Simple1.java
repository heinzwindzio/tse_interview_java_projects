public class Simple1 {
    
    public static void main(String[] args){

        // before generics, this would throw a runtime error:
        try {
            Class s = String.class;
            Integer i = (Integer)s.getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            System.out.println(e);
        }


        // with generics, throws a compile time error:
        // Class<String> s2 = String.class;
        // Integer i2 = (Integer)s2.getDeclaredConstructor().newInstance();



    }
}
