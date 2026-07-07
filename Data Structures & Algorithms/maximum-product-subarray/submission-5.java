class Solution {
    public int maxProduct(int[] nums) {
        int dot=1;
        int neg=1;
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(max<0){
                    max=0;
                }
                dot = 1;
                neg = 1;
                continue;
            }
            dot = dot * nums[i];
            neg = neg * nums[i];
            max = Math.max(Math.max(dot,neg),max);
            if(dot<0){
                dot = 1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0||neg/nums[i]==1){continue;}
            neg = neg/nums[i];
            max = Math.max(neg,max);
        }
        return max;
    }
}
