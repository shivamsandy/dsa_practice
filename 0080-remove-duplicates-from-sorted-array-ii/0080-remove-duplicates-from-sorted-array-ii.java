class Solution {
    public int removeDuplicates(int[] arr) {
        int count = 1;
        int j=0;
        for(int i=0;i<arr.length;i++){
            
            if(i>0 && arr[i] ==arr[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count <=2){
                arr[j++]=arr[i];
                
            }
        }
             
             return j;
        
    }
}