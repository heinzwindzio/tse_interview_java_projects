public class Test {
    

    public static void main(String[] args){

        int[] times = {1, 100, 3001, 3002};

        RecentCounter rc = new RecentCounter();

        for (int t : times){
            System.out.println("time: " + t + ", count: " + rc.ping(t));
        }
    }
}
