public class advRecursion11 {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int verPlace = placeTiles(n-m, m);

        int horPlace = placeTiles(n -1, m);

        return verPlace + horPlace;
    }
    public static void main(String[] args) {
        int n = 3; 
        int m = 3;
        System.out.println(placeTiles(n, m));
    }
}
