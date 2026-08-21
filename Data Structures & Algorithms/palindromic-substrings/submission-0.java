class Solution {
    int res=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return res;
    }
    public void helper(String s, int l,int r){
        while(l>=0&&r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                res++;
            }else{
                break;
            }
            l--;
            r++;
        }
    }
}
