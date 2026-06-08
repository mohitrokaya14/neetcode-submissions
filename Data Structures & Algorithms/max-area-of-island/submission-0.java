class Solution {
    int area;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area = 0;
                    helper(grid,i,j);
                    max=Math.max(area,max);
                }
            }
        }
        return max;
    }
    public void helper(int[][] grid,int i ,int j){
        if(grid[i][j]!=1){
            return;
        }
        grid[i][j]=0;
        area++;

        if(i-1>=0){
            helper(grid,i-1,j);
        }
        if(i+1<grid.length){
            helper(grid,i+1,j);
        }
        if(j-1>=0){
            helper(grid,i,j-1);
        }
        if(j+1<grid[0].length){
            helper(grid,i,j+1);
        }
    }
}
