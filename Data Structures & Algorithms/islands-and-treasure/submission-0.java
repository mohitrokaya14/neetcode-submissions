class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int[][] dirs = {
                {1,0},{-1,0},{0,1},{0,-1}
            };
        int count=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            count++;
            for(int k=0;k<size;k++){
                int[]ij=queue.poll();
                int i = ij[0];
                int j = ij[1];

                for(int[]dir : dirs){
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if(ni<0||nj<0||ni>=grid.length||nj>=grid[0].length||grid[ni][nj]!=2147483647){
                        continue;
                    }

                    grid[ni][nj]=count;
                    queue.offer(new int[]{ni,nj});
                }
            }
        }
        return;
    }
}
