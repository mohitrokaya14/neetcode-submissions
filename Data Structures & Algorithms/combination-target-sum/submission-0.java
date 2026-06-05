class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        combinations(nums,target,0,0);
        return res;
    }
    public void combinations(int[]nums,int target,int i,int sum){
        if(sum==target){
            res.add(new ArrayList<>(combination));
            return;
        }if(sum>target||i==nums.length){
            return;
        }
        sum+=nums[i];
        combination.add(nums[i]);
        combinations(nums,target,i,sum);

        sum-=nums[i];
        combination.remove(combination.size()-1);
        combinations(nums,target,i+1,sum);
    }
}
