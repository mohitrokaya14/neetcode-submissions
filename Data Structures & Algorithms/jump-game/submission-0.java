class Solution {
    public boolean canJump(int[] nums) {
        int i=0,h=0;
        while(i<nums.length-1){
            if(nums[i]>=h){
                h=nums[i];
            }
            if(h==0){
                return false;
            }
            h--;
            i++;
        }
        return true;
    }
}
