class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){return 0;}
        if(nums.length==1){return nums[0];}
        if(nums.length==2){return Math.max(nums[0],nums[1]);}

        nums[2] += nums[0]; 
        int max=Math.max(nums[2],nums[1]);
        for(int i=3;i<nums.length;i++){
            nums[i]+=Math.max(nums[i-2],nums[i-3]);
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}