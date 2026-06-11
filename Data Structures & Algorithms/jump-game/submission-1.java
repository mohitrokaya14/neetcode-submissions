class Solution {
    public boolean canJump(int[] nums) {
        int i=0,max_dist=0;
        while(i<nums.length-1){
            if(nums[i]>=max_dist){
                max_dist=nums[i];
            }
            if(max_dist==0){
                return false;
            }
            max_dist--;
            i++;
        }
        return true;
    }
}
