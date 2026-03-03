public class Recursion6 {
     //calculate x^n using recursion with stack heigth logn;
    public static int calcPow(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        // n is even
        if(n % 2 == 0){
            return calcPow(x, n/2) *calcPow(x, n/2);
        }
        else{
            return calcPow(x, n/2) *calcPow(x, n/2) * x;
        }
    }

        public static void main(String args[]){
        int ans = calcPow(2, 3);
        System.out.println(ans);
    }
}
