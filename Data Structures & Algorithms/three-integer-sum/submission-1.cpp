class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        //{-4,-1,-1,0,1,2}

        vector<vector<int>>output;

        int right,left;


        for(int i = 0;i<nums.size();i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            right = nums.size()-1;
            left = i+1;
            while(left<right){
                if(nums[right]+nums[left]+nums[i]==0){
                    output.push_back({nums[i],nums[left],nums[right]});
                    while(left<right&&nums[left]==nums[left+1])left++;
                    while(left<right&&nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                }else if(nums[right]+nums[left]+nums[i]>0){
                    right--;
                }else{
                    left++;
                }
        }}
        return output;
    }
};
