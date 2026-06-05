class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinations(candidates,target,0,0);
        return res;
    }
    public void combinations(int[] nums,int target,int i,int sum){
        if(sum==target){
            res.add(new ArrayList<>(combination));
            return;
        }if(sum>target||i==nums.length){
            return;
        }

        //if(!set.contains(nums[i])){}

        sum+=nums[i];
        combination.add(nums[i]);
        combinations(nums,target,i+1,sum);

        sum-=nums[i];
        combination.remove(combination.size()-1);
        while(i<nums.length-1&&nums[i]==nums[i+1]){
            i=i+1;
        }
        combinations(nums,target,i+1,sum);
    }
}
