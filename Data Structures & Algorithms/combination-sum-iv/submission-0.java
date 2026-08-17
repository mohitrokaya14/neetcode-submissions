class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        return helper(nums,target);
    }
    public int helper(int[] nums, int target){
        if(map.containsKey(target)){
            return map.get(target);
        }

        if(target==0){
            return 1;
        }

        if(target<0){
            return 0;
        }

        int ways = 0;
        for(int num : nums){
            ways += helper(nums,target-num);
        }
        map.put(target,ways);
        return ways;
    }
}