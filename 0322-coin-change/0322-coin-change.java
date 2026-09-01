class Solution {
    public int coinChange(int[] coins, int amount) {

        // GIVE TLE USING BACKTRACING 
        int n  =  coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
         int ans =recur_FindNOfCOINS_memo(amount,coins, n - 1,dp);

        return ans >= 100000 ? -1 : ans;
    }




    // public static int recur(int coins[] , int amount, int index){

    //     // base case
    //     if(amount == 0){
    //         return 0;
    //     }
    //     if(index<0){
    //         return Integer.MAX_VALUE;
    //     }


    //     // pick no pick
    //     int pick  =100000;
    //     if(coins[index]<=amount){
    //         pick  = 1+ recur(coins,amount-coins[index],index);
    //     }
    //     int no_pick  =  0 + recur(coins,amount,index-1);

    //     return Math.min(pick,no_pick);
    // }

  

       public static int recur_FindNOfCOINS_memo(
            int amount,
            int coins[],
            int index,
            int dp[][]) {

        if(amount == 0){
            return 0;
        }

        if(index < 0){
            return 100000;
        }

        if(dp[index][amount] != -1){
            return dp[index][amount];
        }

        int pick = 100000;

        if(coins[index] <= amount){

            pick = 1 + recur_FindNOfCOINS_memo(
                    amount - coins[index],
                    coins,
                    index,
                    dp
            );
        }

        int no_pick = recur_FindNOfCOINS_memo(
                amount,
                coins,
                index - 1,
                dp
        );

        dp[index][amount] = Math.min(pick, no_pick);

        return dp[index][amount];
    }


}