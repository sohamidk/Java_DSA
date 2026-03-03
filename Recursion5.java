public class Recursion5{
    //calculate x^n using recursion with stack heigth n;
    public static int findXn(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int a = findXn(x, n-1);
        int b = x * a;
        return b;
    }

    public static void main(String args[]){
        int ans = findXn(2, 3);
        System.out.println(ans);
    }
    
}
