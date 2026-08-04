class Solution {
    public int[] distinctDifferenceArray(int[] arr) {
        int k  =arr.length;

    int ans[] =  new int[k];
    
    for(int i=0;i<arr.length;i++){
        int prefix = count(arr, 0, i);
        int suffix = count(arr, i + 1, k - 1);

        ans[i] = prefix - suffix;
    }

    return ans;
        
    }



    public  int count(int arr[] ,int strt  ,int end){
    
        HashSet<Integer> set  =  new HashSet<>();
        for(int i=strt;i <=end;i++){
            set.add(arr[i]);
        
        }
        return set.size();
    }
}