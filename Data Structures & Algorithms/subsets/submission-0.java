class Solution {
    List<Integer> subset = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        sub(0,nums);
        return res;
    }
    public void sub(int i,int[] nums){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        sub(i+1,nums);

        subset.remove(subset.size()-1);
        sub(i+1,nums);

    }
}
