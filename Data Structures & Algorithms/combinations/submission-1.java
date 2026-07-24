class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> com = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(n,k,1);
        return res;
    }

    public void helper(int n,int k,int i){
        if(com.size()==k){
            res.add(new ArrayList<>(com));
            return;
        }
        
        if(i>n){return;}

        com.add(i);
        helper(n,k,i+1);

        com.remove(com.size()-1);
        helper(n,k,i+1);
    }
}