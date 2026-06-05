class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int>freq;
        vector<pair<int,int>>eandf;
        vector<int>output;

        for(int num : nums){
            freq[num]++;
        }

        eandf.insert(eandf.end(),freq.begin(),freq.end());

        std::sort(eandf.begin(), eandf.end(), [](const std::pair<int, int>& a, const std::pair<int, int>& b) {
            return a.second > b.second;
        }); 

        for(int i = 0;i<k;i++){
            output.push_back(eandf[i].first);
        }
    return output;
    }
};
