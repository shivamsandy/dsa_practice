class Solution {
    public int getMaximumGold(int[][] grid) {
         int row  =  grid.length;
        int col  =  grid[0].length;

        int max =0;

        for(int i  =0 ;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]!=0){
                    max  = Math.max(max,dfs(grid,i,j));
                }
            }
        }

        return max;

         
        
    }
        public static int dfs(int grid[][], int row , int col){
        int r = grid.length;
    int c = grid[0].length;

    // invalid case
    if(row < 0 || col < 0 || row >= r || col >= c || grid[row][col] == 0){
        return 0;
    }

        // MARK VISITED
        int gold =grid[row][col]; 
        
        grid[row][col] =0;


         int down  = dfs(grid, row + 1, col);
    int left  = dfs(grid, row, col - 1);
    int up    = dfs(grid, row - 1, col);
    int right = dfs(grid, row, col + 1);

    // backtracking
    grid[row][col] = gold;

    return gold + Math.max(
            Math.max(down, up),
            Math.max(left, right));
    }
}