class Solution {
    public int majorityElement(int[] arr) {
  HashMap<Integer,Integer> mp =new HashMap<>();
        
        // int arr[] = {2,2,1,1,1,2,2};
        int n  =arr.length;

        for (int num : arr) {
        mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int majority = -1;

        // for (int key : mp.keySet()) {
        //     if (mp.get(key) > n / 2) {
        //         majority = key;
        //         break;
        //     }
        // }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>n/2){
                majority = entry.getKey();
                break;
            }
        }
        // System.out.println("majority element = "+majority);
        return majority;
    }
}