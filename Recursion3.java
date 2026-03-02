public class Recursion3 {
    //calculate factorial using recursion
    public static int calcFact(int n){
        if( n == 1 || n == 0){
            return 1;
        }
        int calc_nm1 = calcFact(n-1);
        int fact_n = n * calc_nm1;
        return fact_n;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = calcFact(n);
        System.out.println(ans);
    }
    
}
