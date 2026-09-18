class Solution {
    public int findMaxLength(int[] arr) {
         for(int i =0;i<arr.length;i++){
            if(arr[i] ==0){
                arr[i]=-1;
            }
        }


        int prefix_sum =0;
        HashMap<Integer,Integer> map  =  new HashMap<>();

        map.put(0,-1); // BHUL TOH NAHI GYE HMME (*_*) 

        int max_length  = 0;
        for(int i =0;i<arr.length;i++){
            prefix_sum +=arr[i];

            if(map.containsKey(prefix_sum)){
                max_length = Math.max(max_length, i - map.get(prefix_sum));
            }else{
                map.put(prefix_sum,i);
            }

        }
        return max_length;
        
    }
}