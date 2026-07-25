class Solution {
    public int[] applyOperations(int[] arr) {
        
        for(int i =0;i<arr.length -1;i++){
            if(arr[i] != arr[i+1]){
                continue;
            }else if(arr[i] == arr[i+1]){
                arr[i] = arr[i] *2;
                arr[i+1] =0;
            }

        }
        // NOW SHIFT ALL THE ZEROS TO THE END
        int j = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp  =arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
                j++;
            }

        }
        return arr;
        
    }
}