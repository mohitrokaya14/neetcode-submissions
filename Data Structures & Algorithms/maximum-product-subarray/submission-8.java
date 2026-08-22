class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int num = nums[i];

            int oldmax = max;
            int oldmin = min;

            max = Math.max(num,Math.max(oldmin*num,oldmax*num));
            min = Math.min(num,Math.min(oldmin*num,oldmax*num));

            res = Math.max(max, res);        
        }
        return res;
    }
}
