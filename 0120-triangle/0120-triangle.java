class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
          int n = triangle.size();
        int dp[][] = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);

        return min_path_triangle(triangle, dp);

        
    }
    
    public static int min_path_triangle(List<List<Integer>> triangle, int dp[][]) {
        int n = triangle.size();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + triangle.get(i).get(j),
                            dp[i - 1][j] + triangle.get(i).get(j));
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < dp[n - 1].length; i++) {
            min = Math.min(min, dp[n - 1][i]);
        }

        return min;

    }
}