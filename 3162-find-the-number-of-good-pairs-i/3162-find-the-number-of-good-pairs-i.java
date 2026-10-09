class Solution {
    public int numberOfPairs(int[] arr1, int[] arr2, int k) {


        
        int count = 0;


        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] %(arr2[j]*k)==0){
                     count++;
                }
            }
        }

         return count  ;

        
    }
}