import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



// Method reference is considered 'syntactic sugar' for lambda expressions
// Java provides four distinct flavors of method references depending on the type of method you want to pass
// todo: https://www.google.com/search?q=what+is+a+method+reference+in+java&sca_esv=2d80dc64812aa762&rlz=1C5GCCM_en&sxsrf=APpeQnupjrrfvGPvTYPLtBfwZ3wdEgj7Mg%3A1783600383681&ei=_5RPavKaKe6sptQPiJSm0QY&biw=1466&bih=839&oq=what+is+a+method+referenc&gs_lp=Egxnd3Mtd2l6LXNlcnAiGXdoYXQgaXMgYSBtZXRob2QgcmVmZXJlbmMqAggAMgUQABiABDIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHkjiLlDVDVjbIXADeAGQAQCYAWOgAdwLqgECMjW4AQPIAQD4AQGYAhygAugMwgIKEAAYRxjWBBiwA8ICDhAAGOQCGNYEGLAD2AEBwgIXEC4Y3AYYuAYY2gYY2AIYyAMYsAPYAQHCAgQQIxgnwgIKECMY8AUYngYYJ8ICCxAAGIAEGIoFGJECwgILEAAYgAQYsQMYgwHCAg4QABiABBiKBRixAxiDAcICChAAGIAEGIoFGEPCAgoQIxieBhjwBRgnwgIIEAAYgAQYsQPCAgoQABiABBgUGIcCwgIIEAAYFhgeGAqYAwCIBgGQBg-6BgYIARABGAmSBwQyNy4xoAeswQGyBwQyNC4xuAfSDMIHBzAuMTEuMTfIB2SACAE&sclient=gws-wiz-serp&safe=active&ssui=on

public class EasyExamples {
    
    public static void main(String[] args){

        // fixed size List
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // 1. Using Lambda Expression
        fruits.forEach(fruit -> System.out.println(fruit));

        // 2. Using Method Reference (Identical behavior, cleaner look)
        // forEach(Consumer Functional Interface)
        fruits.forEach(item -> System.out.println(item));
        
        // if the Consumer method calls an existing method, then we can use syntactic sugar
        fruits.forEach(System.out::println); 

        // This is what it's doing under the hood:
        fruits.forEach(new Consumer<String>() {
                @Override
                public void accept(String item) {
                    System.out.println(item);
                }
        });

    }
}
