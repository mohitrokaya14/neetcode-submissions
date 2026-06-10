class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        int m = heights.length;
        int n = heights[0].length;

        int[][] pacificH = new int[m][n];
        int[][] atlanticH = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pacificH[i][j] = heights[i][j];
                atlanticH[i][j] = heights[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            queue.offer(new int[]{i, 0});
            pacificH[i][0]=-1;
            
        }

        for(int j = 0; j < n; j++) {
            queue.offer(new int[]{0, j});
            pacificH[0][j]=-1;
        }

        int[][] dirs = new int[][]{
            {-1,0},{1,0},{0,1},{0,-1}
        };
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0;k<size;k++){
                int[] ij = queue.poll();
                int i = ij[0];
                int j = ij[1];
                int temp = heights[i][j];
                for(int[]dir:dirs){
                    int ni = i + dir[0];
                    int nj = j + dir[1];
                    if(ni>=m||ni<0||nj<0||nj>=n||pacificH[ni][nj]==-1){
                        continue;
                    }
                    if(pacificH[ni][nj]>=temp){
                        queue.offer(new int[]{ni,nj});
                        pacificH[ni][nj]=-1;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++) {
            queue.offer(new int[]{i, n-1});
            atlanticH[i][n-1]=-1;
        }

        for(int j = 0; j < n; j++) {
            queue.offer(new int[]{m-1, j});
            atlanticH[m-1][j]=-1;
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0;k<size;k++){
                int[] ij = queue.poll();
                int i = ij[0];
                int j = ij[1];
                int temp = heights[i][j];

                for(int[]dir:dirs){
                    int ni = i + dir[0];
                    int nj = j + dir[1];
                    if(ni>=m||ni<0||nj<0||nj>=n||atlanticH[ni][nj]==-1){
                        continue;
                    }
                    if(atlanticH[ni][nj]>=temp){
                        queue.offer(new int[]{ni,nj});
                        atlanticH[ni][nj]=-1;
                    }
                }
            }
        }

        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                if(pacificH[i][j]==atlanticH[i][j]&&pacificH[i][j]==-1){
                    res.add(List.of(i,j));
                }
            }
        }
        return res;
    }
}
