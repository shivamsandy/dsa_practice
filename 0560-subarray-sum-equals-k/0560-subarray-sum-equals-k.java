class Solution {
    public int subarraySum(int[] arr, int k) {
          HashMap<Integer,Integer> map  =  new HashMap<>();
        map.put(0,1);
        int prefix_sum  =0;
        int count  =0 ;


        for(int i =0;i<arr.length;i++){
            prefix_sum +=arr[i];

            if(map.containsKey(prefix_sum -k)){
                count += map.get(prefix_sum-k);
            }
             map.put(prefix_sum,
                    map.getOrDefault(prefix_sum,0)+1);
 
        }
        return count;

    

    }
}
//      WORKS WHEN ALL ELEMENTS ARE POSITIVE
    //       int n  = arr.length;
    //     int sum =0;
    //     int count =0;

    //     int strt =0;
    //     int  end =0;
    //     while(end<n){
    //         sum += arr[end];
    //         while(sum>=target){
    //             if(sum == target){
    //                 count++;
    //             }
    //             sum -= arr[strt];
    //             strt++;
    //         }


    //         end++;
    //     }
    // return count;
