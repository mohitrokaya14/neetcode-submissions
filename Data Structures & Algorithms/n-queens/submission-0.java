class Solution {
    HashSet<Integer> col = new HashSet<>();
    HashSet<Integer> mainD = new HashSet<>();
    HashSet<Integer> offD = new HashSet<>();
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        String s="";
        List<String> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            s=s+'.';
        }
        for(int j=0;j<n;j++){
            board.add(s);
        }
        helper(0,board,n);
        return res;
    }

    public void helper(int i,List<String> board,int n){
        if(i == n){
            res.add(new ArrayList<>(board));
            return;
        }
        StringBuilder sb = new StringBuilder(board.get(i));
        for(int j=0;j<n;j++){
            if((col.contains(j)||offD.contains(i+j)||mainD.contains(i-j))){
                continue;
            }

            col.add(j);
            offD.add(i+j);
            mainD.add(i-j);

            sb.setCharAt(j,'Q');
            board.set(i,sb.toString());

            helper(i+1,board,n);

            sb.setCharAt(j,'.');
            col.remove(j);
            offD.remove(i+j);
            mainD.remove(i-j);
            board.set(i,sb.toString());
        }
    }
}
