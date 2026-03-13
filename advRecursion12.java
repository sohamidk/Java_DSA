public class advRecursion12 {
    public static int callGuest(int n){
        if(n <= 1){
            System.out.println();
            return 1;
        }
        int x = callGuest(n-1);
        int y = (n-1)* callGuest(n-2);
        return x + y;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuest(n));
    }
}
