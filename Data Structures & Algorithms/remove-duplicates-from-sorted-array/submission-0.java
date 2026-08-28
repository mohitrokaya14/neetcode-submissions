class Solution {
    public int removeDuplicates(int[] nums) {


        int count = nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1] = Integer.MAX_VALUE;
                count--;
            }
        }

        Arrays.sort(nums);
        return count;
    }
}