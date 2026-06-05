class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>seen;
        int compliment;

        for(int i = 0;i<nums.size();i++){
           compliment = target - nums[i];
           if(seen.count(compliment)){
            return{seen[compliment],i};
           }
           seen[nums[i]]=i;
        }

        return {};
    }
};
