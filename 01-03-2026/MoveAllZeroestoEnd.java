public class MoveAllZeroestoEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int ind = 0;
        
        for(int i = 0;i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
        }
    }
}
