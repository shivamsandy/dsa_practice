class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int dp1[] = new int[n - 1];
int dp2[] = new int[n - 1];

Arrays.fill(dp1, -1);
Arrays.fill(dp2, -1);

        if(n==1){
            return arr[0];
        }
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                arr1[j++]=arr[i];
            }
            if(i!=n-1){
                arr2[k++]=arr[i];
            }
        }



        return Math.max(HOUSE_robber_1(arr1,dp1,arr1.length-1),HOUSE_robber_1(arr2,dp2,arr2.length-1));
    }
    public int HOUSE_robber_1(int arr[], int dp[] ,int index){
        
        if(index ==0){
            dp[index] = arr[0];
            return arr[0]; 
        }
        if(index<0){
            return 0;
        }
         
        if(dp[index]!= -1){
            return dp[index];
        }
        int pick  =  arr[index] + HOUSE_robber_1(arr, dp, index-2);
        int no_pick = 0+ HOUSE_robber_1(arr, dp, index-1);

        dp[index] = Math.max(no_pick, pick);
        

        return dp[index];
    }

}