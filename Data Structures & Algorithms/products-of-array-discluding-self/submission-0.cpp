class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        unordered_map<int,int>prefix;
        vector<int> output(nums.size());

        int m = 1;
        for(int i = 0;i<nums.size();i++){
            prefix[i] = m;
            m = m*nums[i];
        }
        m = 1;
        for(int j = nums.size()-1;j>=0;j--){
            output[j] = prefix[j]*m;
            m = m * nums[j];
        }
        return output;
    }
};
