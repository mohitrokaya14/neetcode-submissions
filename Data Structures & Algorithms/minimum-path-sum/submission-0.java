class Solution {
    int[][] arr = new int[201][201];
    public int minPathSum(int[][] grid) {
        for(int[] row : arr){
            Arrays.fill(row,-1);
        }

        return helper(grid,grid.length-1,grid[0].length-1)+grid[0][0];
    }
    public int helper(int[][] grid,int i,int j){
        if(i<0||j<0){
            return Integer.MAX_VALUE;
        }
        if(arr[i][j]!=-1){
            return arr[i][j];
        }
        if(i==0&&j==0){
            return 0;
        }

        int min = Math.min(helper(grid,i-1,j),helper(grid,i,j-1))+grid[i][j];
        arr[i][j]=min;

        return min;
    }
}