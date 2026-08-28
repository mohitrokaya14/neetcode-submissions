class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                i++;
                continue;
            }
            
            nums[j] = nums[i]; 
            j++;
            i++;
        }

        nums[j] = nums[i];

        return j+1;
    }
}
