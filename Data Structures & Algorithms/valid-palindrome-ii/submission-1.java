class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r = s.length()-1;

        int count=0;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return helper(l,r-1,s)||helper(l+1,r,s);
            }
            l++;
            r--;
        } 
        return true;
    }

    public boolean helper(int l,int r,String s){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}