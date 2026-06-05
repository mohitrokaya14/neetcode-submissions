class Solution {
    List<String> res = new ArrayList<>();
    String str = "";
    public List<String> generateParenthesis(int n) {
        generator(n,0,0);
        return res;
    }
    public void generator(int n,int open, int close){
        if(close>open){
            return;
        }
        if(open==n&&close==n){
            res.add(new String(str));
            return;
        }

        if(open<n){
            str+="(";
            generator(n,open+1,close);
            str = str.substring(0,str.length()-1);
        }
        if(close<n){
            str+=")";
            generator(n,open,close+1);
            str = str.substring(0,str.length()-1);
        }
    }
}
