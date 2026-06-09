class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0){
            return 0;
        }

        int[][] dirs = {
            {1,0},{-1,0},{0,1},{0,-1}
        };

        int count=0;
        while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            for(int k=0;k<size;k++){
                int[]ij = queue.poll();
                int i=ij[0];
                int j=ij[1];

                for(int[] dir:dirs){
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if(ni<0||ni>=grid.length||nj<0||nj>=grid[0].length||grid[ni][nj]!=1){
                        continue;
                    }

                    grid[ni][nj]=2;
                    queue.offer(new int[]{ni,nj});
                    fresh--;
                }
            }
        }
        if(fresh==0){
            return count-1;
        }else{
            return -1;
        }
    }
}
