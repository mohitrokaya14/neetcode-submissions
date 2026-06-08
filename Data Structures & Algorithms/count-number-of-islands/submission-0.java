class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    island++;
                    helper(grid,i,j);
                }
            }
        }
        return island;
    }

    public void helper(char[][] grid,int i,int j){
        if(grid[i][j]!='1'){
            return;
        }
        grid[i][j]='#';
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
