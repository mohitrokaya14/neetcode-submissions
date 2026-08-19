class Solution {
    Boolean[] arr = new Boolean[201];
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(String word : wordDict){
            set.add(word);
        }
        return helper(0,s,set);
    }

    public boolean helper(int i,String s,HashSet<String> set){
        if(arr[i]!=null){
            return arr[i];
        }

        if(i==s.length()){return true;}
        
        boolean condition = false;
        for(int j=i+1;j<=s.length();j++){
            if(set.contains(s.substring(i,j))){
                condition = condition||helper(j,s,set);
            }
        }
        arr[i] = condition;
        return condition;
    }
}
