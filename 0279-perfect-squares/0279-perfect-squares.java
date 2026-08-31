class Solution {
    public int numSquares(int n) {
          if(n<=3){
            return n;
        }int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n ,dp);
        
    }
    
    public static int helper(int n,int dp[]){
        int min_count  =  Integer.MAX_VALUE;
        if(n<=3){
            return n;
        }
        int a  = (int)Math.sqrt(n);
        if(a*a==n){
            return 1;
        }

         if (dp[n] != -1) {
            return dp[n];
        }

        for(int i=1;i*i<=n;i++){
            int result = 1 + helper(n-i*i,dp);
            min_count = Math.min(min_count,result);
        }
         dp[n] = min_count;

        return dp[n];
    }
}