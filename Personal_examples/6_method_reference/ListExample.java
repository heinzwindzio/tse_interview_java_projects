import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



// Method reference is considered 'syntactic sugar' for lambda expressions
// Java provides four distinct flavors of method references depending on the type of method you want to pass
// todo: https://www.google.com/search?q=what+is+a+method+reference+in+java&sca_esv=2d80dc64812aa762&rlz=1C5GCCM_en&sxsrf=APpeQnupjrrfvGPvTYPLtBfwZ3wdEgj7Mg%3A1783600383681&ei=_5RPavKaKe6sptQPiJSm0QY&biw=1466&bih=839&oq=what+is+a+method+referenc&gs_lp=Egxnd3Mtd2l6LXNlcnAiGXdoYXQgaXMgYSBtZXRob2QgcmVmZXJlbmMqAggAMgUQABiABDIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHkjiLlDVDVjbIXADeAGQAQCYAWOgAdwLqgECMjW4AQPIAQD4AQGYAhygAugMwgIKEAAYRxjWBBiwA8ICDhAAGOQCGNYEGLAD2AEBwgIXEC4Y3AYYuAYY2gYY2AIYyAMYsAPYAQHCAgQQIxgnwgIKECMY8AUYngYYJ8ICCxAAGIAEGIoFGJECwgILEAAYgAQYsQMYgwHCAg4QABiABBiKBRixAxiDAcICChAAGIAEGIoFGEPCAgoQIxieBhjwBRgnwgIIEAAYgAQYsQPCAgoQABiABBgUGIcCwgIIEAAYFhgeGAqYAwCIBgGQBg-6BgYIARABGAmSBwQyNy4xoAeswQGyBwQyNC4xuAfSDMIHBzAuMTEuMTfIB2SACAE&sclient=gws-wiz-serp&safe=active&ssui=on

public class ListExample {
    
    public static void main(String[] args){

        // fixed size List, unlike ArrayList
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // List.forEach(Consumer Functional Interface)
        
        // 1. Using Lambda Expression
        // it's calling the Consumer.accept() method, which has been overridden to have this logic in it
        fruits.forEach(fruit -> System.out.println(fruit));

        fruits.forEach(item -> System.out.println(item));
        
        // 2. if the Functional Interface is calling an existing method, then we can just use syntactic sugar
        fruits.forEach(System.out::println); 

        // This is what it's doing under the hood:
        fruits.forEach(new Consumer<String>() {
                @Override
                public void accept(String item) {
                    
                    // existingMethod(item);
                    System.out.println(item);
                }
        });

    }
}
