class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return helper(nums,0);
    }
    public int helper(int[] nums,int i){
        if(map.containsKey(i)){
            return map.get(i);
        }

        if(i>=nums.length){
            return 0;
        }

        int max = Math.max(helper(nums,i+2)+nums[i],helper(nums,i+1));
        map.put(i,max);
        return max;
    }
}
