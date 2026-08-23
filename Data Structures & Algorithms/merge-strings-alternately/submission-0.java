class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String res = "";

        while(i<Math.max(word1.length(),word2.length())){
            if(i<word1.length()){
                res = res + word1.charAt(i);
            }
            if(i<word2.length()){
                res = res + word2.charAt(i);
            }
            i++;
        }
        
        return res;
    }
}