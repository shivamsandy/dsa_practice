class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        TreeMap<Integer,Integer> map  =  new TreeMap<>();
        int ans[] =  new int [arr1.length];

        for(int i =0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int y=0;

        for(int i=0;i<arr2.length;i++){
             int freq  = map.get(arr2[i]);
             map.remove(arr2[i]);
             for(int j=0;j<freq;j++){
                ans[y++] =arr2[i];
             }
            
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

    int key = entry.getKey();
    int freq = entry.getValue();

    for (int j = 0; j < freq; j++) {
        ans[y++] = key;
    }
}

        return ans;



    }
}