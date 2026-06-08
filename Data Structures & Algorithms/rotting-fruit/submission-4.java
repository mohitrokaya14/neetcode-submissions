class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int[] ij = new int[2];
        int fresh=0;
        for(int k=0;k<grid.length;k++){
            for(int l=0;l<grid[0].length;l++){
                if(grid[k][l]==2){
                    queue.offer(new int[]{k,l});
                }else if(grid[k][l]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0){
            return 0;
        }

        int count=-1;
        while(!queue.isEmpty()){
            int size = queue.size();
            count++;
            for(int r=0;r<size;r++){
                ij = queue.poll();
                int i=ij[0];
                int j=ij[1];

                if(i-1>=0&&grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    queue.offer(new int[]{i-1,j});
                    fresh--;
                }
                if(i+1<grid.length&&grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    fresh--;
                    queue.offer(new int[]{i+1,j});
                }
                if(j-1>=0&&grid[i][j-1]==1){
                    queue.offer(new int[]{i,j-1});
                    fresh--;
                    grid[i][j-1]=2;
                }
                if(j+1<grid[0].length&&grid[i][j+1]==1){
                    queue.offer(new int[]{i,j+1});
                    fresh--;
                    grid[i][j+1]=2;
                }
            }
        }

        if(fresh==0){
            return count;
        }else{
            return -1;
        }
    }
}
