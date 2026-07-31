import java.util.Arrays;

public class SimpleInts {
    
    public static void main(String[] args) {
        
        // declaring size and assign values manually
        int[] n = new int[4];
        n[2] = 100;
        n[3] = 200;

        // literal array
        int[] o = {4, 2, 6, 8};

        for (int x=0; x<n.length; x++){
            System.out.println("This is n: " + n[x] + ". This is o: " + o[x]);
        }

        // can't sort ints descending!
        Arrays.sort(o);
        System.out.println("This is o after sorting: " + Arrays.toString(o));

        

    }
}
