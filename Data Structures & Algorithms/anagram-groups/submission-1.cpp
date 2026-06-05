class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<long long,int> box;
        vector<vector<string>> output;
        int k = 0;
        long long temp = 1;

        for(int i = 0;i<strs.size();i++){
            for(int j = 0;j<strs[i].length();j++){
                temp = int(strs[i][j])*temp;
            }
            
            if(!(box.count(temp))){
                box[temp] = k;
                output.push_back({strs[i]});
                k = k + 1;
            }else{
                output[box[temp]].push_back(strs[i]);
            }
            temp = 1;
        }
        return output;
    }
};
