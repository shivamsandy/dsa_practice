class Solution {
    public int minPathSum(int[][] grid) {
        
        int m =  grid.length;
        int n  =  grid[0].length;
       
        
        
      
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans  = recur_memo(grid,m-1,n-1,dp);
           if(ans != Integer.MAX_VALUE){
            return ans;
        }else{
            return -1;
        }
        
    }
      public static int recur_memo(int grid[][],int row, int col,int dp[][]){ //  this is recursion
        if(row < 0 || col < 0){
            return 1000000;
        }
        if(row==0 && col==0){
            dp[row][col] =  grid[0][0];
            return grid[0][0];
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }


        // move up
        int up  =  grid[row][col] + recur_memo(grid, row-1, col,dp);
        int left  =  grid[row][col] + recur_memo(grid, row, col-1,dp);

        dp[row][col]  = Math.min(up, left);

        
        return dp[row][col];

    }
}