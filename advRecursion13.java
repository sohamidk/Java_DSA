public class advRecursion13 {
    //calculate sum of n(n-1)
    public static int calcSum(int n){
       if(n == 1){
        return 1;
       }
       
        int x = calcSum(n-1);
        int y = n * (n-1);
        return x + y;
    }
    //1+2(1)+3(2)+4(3)....+n(n-1)
    public static void main(String args[]){
        int n = 3;
        System.out.println(calcSum(n));
    }
}
