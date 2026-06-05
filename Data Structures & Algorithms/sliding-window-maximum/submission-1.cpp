class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> output;
        int l = 0,g = 0;
        for(int r = 0;r<nums.size();r++){
            if((r-l+1)==k){
                for(int j = l;j<=r;j++){
                    g = max(g,nums[j]);
                }
                l++;
                output.push_back(g);
                g = nums[l];
            }
        }
        return output;
    }
};
