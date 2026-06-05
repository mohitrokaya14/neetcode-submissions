class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets(nums,0);
        return res;
    }
    public void subsets(int[]nums,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        subsets(nums,i+1);

        while(i<nums.length-1&&nums[i]==nums[i+1]){
            i++;
        }
        subset.remove(subset.size()-1);
        subsets(nums,i+1);
    }
}
