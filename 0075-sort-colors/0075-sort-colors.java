class Solution {
    public void sortColors(int[] arr) {

        // Arrays.sort(nums);

        // METHOD 1 
        //  HashMap<Integer, Integer> freq = new HashMap<>();

        // for (int num : nums) {
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }

        // int index  = 0 ;
        // for(int i=0;i<=2;i++){
        //     if(freq.containsKey(i)){
        //         for (int j= 0; j < freq.get(i); j++) {
        //             nums[index] =i;
        //             index++;
        //         }
        //     }
        // }
         int low =0;
        int mid =0;
        int high  = arr.length-1;

        while (mid <=high) {
            if(arr[mid]==0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] ==1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
            
        }



        
    }
     public void swap(int arr[], int i ,int j){
        int temp  =  arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
}