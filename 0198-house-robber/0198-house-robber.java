
class Solution {

    public int rob(int[] arr) {
 
     int index  =  arr.length-1;
        int dp [] =  new int[arr.length];
        Arrays.fill(dp, -1);
        return By_memo(arr,index,dp);
    }
    public  int By_memo(int arr[] ,int index ,int dp[]){
        if(index ==0){
            return arr[0];
        }
        if(index <0) return 0;

        if(dp[index] !=-1){
            return dp[index];
        }

        int pick =  arr[index] + By_memo(arr,index-2 ,dp);
        
        int no_pick =  By_memo(arr,index-1,dp);

        dp[index] =  Math.max(pick, no_pick);

        return dp[index];
    }

}