class Solution {
    public int numPairsDivisibleBy60(int[] arr) {
         HashMap<Integer,Integer> map  =  new HashMap<>();
       

        int count =0;
        // int k =60;
    

        for(int i =0;i<arr.length;i++){
        
            int rem = arr[i]%60;
            int com  =  (60 - rem) % 60; // HANDLING NEGATIVE NO NEED IN THE QUESTION

           count += map.getOrDefault(com, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }
        return count;
        
    }
}