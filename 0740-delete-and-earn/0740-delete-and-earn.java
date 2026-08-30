class Solution {
    public int deleteAndEarn(int[] arr) {
        int n  =  arr.length;
        
        int max = 0;

        for (int x : arr) {
            max = Math.max(max, x);
        }

        int ans[] = new int[max + 1];
        for(int i =0;i<n;i++){
            ans[arr[i]] +=arr[i]; 
        }
        return Apply_pick_no_pick(ans);
        
    }
    public static int Apply_pick_no_pick(int ans[]){
        int dp[] =  new int[ans.length];
        dp[0] =     ans[0];
        dp[1] = Math.max(ans[0],ans[1]);

         for(int i=2;i<ans.length;i++){
            dp[i] = Math.max(ans[i]+ dp[i-2],dp[i-1]);
         }
        
       return dp[ans.length-1];
    }
}