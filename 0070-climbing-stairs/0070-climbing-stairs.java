class Solution {
    public int climbStairs(int n) {
        int dp[] =  new int[n+1];
        Arrays.fill(dp,-1);
        
        return climb_stair(n,dp);

    }
     public   int climb_stair(int n ,int dp[]){  //  using memoization
        if(n<=2) return n;

        if(dp[n] !=-1){
            return dp[n];
        }
        
        dp[n] =climb_stair(n-1, dp) +climb_stair(n-2, dp);

        return dp[n];
    }
    // public int climb_rec(int n ){ 

    //     // 2^n TLE IN LEETCODE
    //     if(n<=2) return n;

    //     return climb_rec(n-1) + climb_rec(n-2);
    // }
}