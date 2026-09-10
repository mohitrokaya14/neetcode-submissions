class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]<=0||nums[i]>n||nums[i]==nums[nums[i]-1]){
                i++;
                continue;
            }
            
            int temp = nums[i];
            nums[i] = nums[nums[i]-1];
            nums[temp-1] = temp;  
        }    

        int res = 1;
        for(i=0;i<n;i++){
            if(res==nums[i]){
                res++;
            }
        }
        return res;
    }
}