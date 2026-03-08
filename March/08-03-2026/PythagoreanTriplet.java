public class PythagoreanTriplet {
    boolean pythagoreanTriplet(int[] arr) {
        // 2 pointer approach
        
        // TC = O(nlogn + n2)
        // SC = O(1)
        
        // boolean res = false;
        // int n = arr.length;
        
        // for(int i = 0; i<n; i++){
        //     arr[i] = arr[i] * arr[i];
        // }
        
        // Arrays.sort(arr);
        
        // for(int i = n-1; i>= 2; i--){
            
        //     int left = 0;
        //     int right = i-1;
        //     int c2 = arr[i];
            
        //     while(left<right){
        //         int a2 = arr[left];
        //         int b2 = arr[right];
                
        //         if(a2 + b2 < c2){
        //             left++;
        //         }
        //         else if(a2 + b2 > c2){
        //             right--;
        //         }
        //         else {
        //             res = true;
        //             break;
        //         }
        //     }
            
        //     if(res) break;
        // }
        
        // return res;
        
        // Using Set 
        // TC = O(n2)
        // Sc = O(n)
        int n = arr.length;
        HashSet<Integer> s = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            s.add(arr[i]*arr[i]);
        }
        
        for(int i = 0; i<n;i++){
            for(int j = i + 1; j<n; j++){
                int a2 = arr[i] * arr[i];
                int b2 = arr[j] * arr[j];
                
                int c2 = a2+b2;
                if(s.contains(c2)){
                    return true;
                }
            }
        }
        
        return false;
    }
}

