class Solution {
    public int maximumWealth(int[][] account) {
        
        int m  = account.length;
        int n = account[0].length;

        int max  =  Integer.MIN_VALUE;

        for(int  i  =0;i<m;i++){
            int sum  =  0;

            for(int j=0;j<n;j++){
                sum  +=account[i][j];
            }
            max  =  Math.max(max, sum);

        }

        return max;
        
    }
}