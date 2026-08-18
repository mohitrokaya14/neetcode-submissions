class Solution {
    int[][] arr = new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int[] row:arr){
            Arrays.fill(row,-1);
        }

        return helper(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1);
    }
    public int helper(int[][] grid,int i, int j){
        
        if(i<0||j<0){
            return 0;
        }
        if(grid[i][j]==1){
            return 0;
        }
        if(i==0&&j==0){
            return 1;
        }
        if(arr[i][j]!=-1){
            return arr[i][j];
        }
        
        int ways = helper(grid,i-1,j) + helper(grid,i,j-1);
        arr[i][j]=ways;

        return ways;
    }
}
