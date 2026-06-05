class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> permute = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutes(0,nums);
        return res;
    }
    public void permutes(int i,int[]nums){
        if(i==nums.length){
            res.add(new ArrayList<>(permute));
            return;
        }
        for(int j=0;j<=i;j++){
            permute.add(j,nums[i]);
            permutes(i+1,nums);
            permute.remove(j);
        }
    }
}
