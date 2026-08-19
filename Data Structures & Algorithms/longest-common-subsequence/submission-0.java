class Solution {
    int[][] arr = new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[] row:arr){
            Arrays.fill(row,-1);
        }
        return helper(text1, text2, text1.length()-1, text2.length()-1);
    }

    public int helper(String t1, String t2, int i, int j){
        if(i<0||j<0){return 0;}
        
        if(arr[i][j]!=-1){
            return arr[i][j];
        }

        if(t1.charAt(i)==t2.charAt(j)){
            return helper(t1,t2,i-1,j-1)+1;
        }
        
        int len=0;
        len = Math.max(helper(t1,t2,i-1,j),helper(t1,t2,i,j-1));
        arr[i][j] = len;
        return len;
    }
}
