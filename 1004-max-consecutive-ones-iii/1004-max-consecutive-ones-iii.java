class Solution {
    public int longestOnes(int[] arr, int k) {

          
         int flip  =0;
         int strt = 0;
         int max_length =0;
         
         for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                flip++;
            }

            if(flip>k){
                while(flip>k){
                    if(arr[strt]==0){
                        flip--;
                    }
                    strt++;
                }
            }

            max_length = Math.max(max_length,i-strt+1);
        }

        // System.out.println(max_length);

        return max_length;
        
    }
}