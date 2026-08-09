class Solution {
    public boolean uniqueOccurrences(int[] arr) {

         HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
            
        }
        
        HashSet<Integer> set  =  new HashSet<>(map.values());

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println("Key = " + entry.getKey()
        //             + ", Value = " + entry.getValue());
        // }

        System.out.println(set);

        if(map.size() ==set.size()){
            return true;
        }else{
            return false;
        }


    
    }
}