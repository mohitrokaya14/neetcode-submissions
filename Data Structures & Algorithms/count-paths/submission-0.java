class Solution {
    int[][] dp = new int[100][100];
    public int uniquePaths(int m, int n) { 
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(m-1,n-1);
    }
    public int helper(int i,int j){
        if(i==0&&j==0){
            return 1;
        }
        if(i==-1||j==-1){return 0;}

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        dp[i][j] = helper(i-1,j)+helper(i,j-1);
        return dp[i][j];
    }
}
