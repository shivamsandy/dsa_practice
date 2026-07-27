class Solution {
    public int[] constructTransformedArray(int[] arr) {

         int result[] = new int[arr.length];
         int n  =  arr.length;

        for(int i  =0;i<arr.length;i++){

            if(arr[i]>0){
                result[i] = arr[(i + arr[i]) % n];
            }
            if(arr[i]<0){
                result[i] = arr[((i + arr[i]) % n + n) % n];

            }

        }
        return result;
        
    }
}