class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result ="";
        int len = strs[0].length();
        for(int i=0;i<strs.length;i++){
            len = Math.min(len,strs[i].length());
        }
        for(int i=0;i<len;i++){
            char temp = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()==0){
                    return result;
                }
                if(strs[j].charAt(i)==temp){
                    continue;
                }
                else{
                    return result;
                }
            }
            result+=temp;
        }
        return result;
    }
}