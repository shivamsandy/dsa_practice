class Solution {
    public long countPairs(int[] nums, int k) {
        // long count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((long)(nums[i]*nums[j])%k==0){
        //             count++;
        //         }
        //     }
        // }

        // return count;
             HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int num : nums) {

            int g = gcd(num, k);

            for (int prev : map.keySet()) {
                if ((long) g * prev % k == 0) {
                    count += map.get(prev);
                }
            }

            map.put(g, map.getOrDefault(g, 0) + 1);
        }

        return count;
        
    }
    public static int gcd(int a ,int b){
        while(b!=0){
            int temp  =b;
            b =a%b;
            a=temp;
        }
        return a;
    }
}