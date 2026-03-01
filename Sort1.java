public class Sort1 {
    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,7,5,3,4,2,1};
        for(int i = 0; i< arr.length-1;i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    //Swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        printArr(arr);
    }
}
