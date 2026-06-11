class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] isSafe = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1){
                    if(board[i][j]=='O'){
                        isSafe[i][j]=true;
                        queue.offer(new int[]{i,j});
                    }
                }
            }
        }

        int[][] dirs = new int[][]{
            {1,0},{-1,0},{0,1},{0,-1}
        };
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0;k<size;k++){
                int[] ij = new int[2];
                ij = queue.poll();
                int i = ij[0];
                int j = ij[1];
                isSafe[i][j]=true;
                for(int[] dir : dirs){
                    int ni = i + dir[0];
                    int nj = j + dir[1];
                    if(ni<0||nj<0||ni>=m||nj>=n||isSafe[ni][nj]||board[ni][nj]!='O'){
                        continue;
                    }
                    queue.offer(new int[]{ni,nj});
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'&&!isSafe[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
}
