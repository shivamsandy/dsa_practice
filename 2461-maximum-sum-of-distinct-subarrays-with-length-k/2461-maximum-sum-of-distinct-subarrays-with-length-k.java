class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
         HashMap<Integer,Integer> map  =  new HashMap<>();

        long sum  =0 ; 
        long max  =0 ; 
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if(i>=k){
                sum -= arr[i-k];
                map.put(arr[i-k],map.get(arr[i-k])-1);

                if(map.get(arr[i-k]) == 0){
                    map.remove(arr[i-k]);
                }

            }

            if(i>=k-1 && map.size() ==k){
                max  =  Math.max(sum, max);
            }
        }
        return max;
    }
}