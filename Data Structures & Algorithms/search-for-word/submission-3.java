class Solution {
    boolean output = false;
    String word = "";
    public boolean exist(char[][] board, String word) {
        this.word = word;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    solve(board,i,j,0);
                }
            }
        }
        return output;
    }
    public void solve(char[][] board,int i,int j,int index){
        if(word.charAt(index)==board[i][j]){
            if(word.length()-1==index){
                output=true;
                return;
            }
            char temp = board[i][j];
            board[i][j]='#';
            if(i-1>=0){
                solve(board,i-1,j,index+1);
            }
            if(i+1<board.length){
                solve(board,i+1,j,index+1);
            }
            if(j-1>=0){
                solve(board,i,j-1,index+1);
            }
            if(j+1<board[0].length){
                solve(board,i,j+1,index+1);
            }
            board[i][j]=temp;
        }
        return;
        
    }
}
