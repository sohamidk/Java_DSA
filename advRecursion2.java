public class advRecursion2 {
    //String reverse using recursion
    public static void printRev(String str, int idx){
     if(idx == 0){
        System.out.print(str.charAt(idx) + " ");
        return ;
     }
     System.out.println(str.charAt(idx)+ " ");
     printRev(str, idx - 1);
    }
    public static void main(String args[]){
        String str = "GitHub";
        printRev(str, str.length() - 1);
    }
}
