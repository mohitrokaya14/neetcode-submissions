class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 0;
        while(i<nums.length){
            if(i>0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            
            nums[j] = nums[i]; 
            j++;
            i++;
        }

        return j;
    }
}
