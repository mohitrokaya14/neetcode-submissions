class Solution {
    Queue<int[]> queue = new LinkedList<>();
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return perimeter(i,j,grid);
                }
            }
        }
        return 0;
    }  
    public int perimeter(int i,int j,int[][] grid){
        grid[i][j]=2;
        int perimeter=0;
        queue.offer(new int[]{i,j});

        int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        while(!queue.isEmpty()){
            int[] ij = queue.poll();
            i = ij[0];
            j = ij[1];
            for(int[] dir : dirs){
                int ni = i+dir[0];
                int nj = j+dir[1];
                if(ni<0||ni>=grid.length||nj<0||nj>=grid[0].length||grid[ni][nj]==0){
                    perimeter++;
                    continue;
                }
                if(grid[ni][nj]==2){
                    continue;
                }
                queue.offer(new int[]{ni,nj});
                grid[ni][nj]=2;
            }
        }
        return perimeter;
    }
}




