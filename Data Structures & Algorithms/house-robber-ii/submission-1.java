class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        if(nums.length==1){return nums[0];}

        int temp = nums[nums.length-1];
        nums[nums.length-1] = 0;
        int left = helper(nums,0);
        map.clear();

        nums[nums.length-1] = temp;
        int right = helper(nums,1);

        return Math.max(right,left);
        
    }
    public int helper(int[] nums,int i){
        if(map.containsKey(i)){
            return map.get(i);
        }

        if(i >= nums.length){return 0;}
        int max = Math.max(helper(nums,i+2)+nums[i],helper(nums,i+1));

        map.put(i,max);
        return max;
    }
}
