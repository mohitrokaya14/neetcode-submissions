class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int lenO = helper(s,i,i);
            int lenE = helper(s,i,i+1);

            len = Math.max(lenO,lenE);
            if(len>end-start+1){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int helper(String s,int l,int r){
        while(l>=0&&r<s.length()){
            if(s.charAt(r)!=s.charAt(l)){
                break;
            }
            l--;
            r++;
        }
        return r-l-1;
    }
}
