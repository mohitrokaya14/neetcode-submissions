class Solution {
    static int[][] dp = new int[100][100];
    public int minDistance(String word1, String word2) {
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return(worker(word1,word2,word1.length()-1,word2.length()-1));
    }
    public static int worker(String word1, String word2, int i ,int j){

        if(i==-1){return j+1;}
        if(j==-1){return i+1;}


        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int match = worker(word1, word2, i-1, j-1);
        if(word1.charAt(i)!=word2.charAt(j)){match++;}

        int del = worker(word1, word2, i, j-1) + 1;

        int add = worker(word1, word2, i-1, j) + 1;

        dp[i][j] = Math.min(Math.min(del ,add),match);
        
        return dp[i][j];
    }
}
