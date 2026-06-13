class Solution {
    public int jump(int[] nums) {
        int maxJump=0;
        int power=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            maxJump = Math.max(maxJump,nums[i]+i);
            if(power==i){
                power = maxJump;
                count++;
            }
        }
        return count;
    }
}
