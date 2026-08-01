class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean flag = true;
        int diff = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
             if(arr[i+1]-arr[i]!=diff){
                flag = false; 
                return flag;     
             }
        }
        return flag;
        
    }
}