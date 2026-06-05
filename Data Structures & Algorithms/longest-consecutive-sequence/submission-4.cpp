class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_map<int, int> consecutive;
        int count = 0, maxLen = 1, temp;

        if (nums.size() == 0) {
            return 0;
        }

        for (int num : nums) {
            consecutive[num] = num - 1;
        }

        for (auto& pair : consecutive) {
            if (consecutive.count(pair.first + 1) == 0 &&
                consecutive.count(pair.first - 1) == 1) {

                temp = pair.first;
                while (consecutive.count(temp) == 1) {
                    count++;
                    temp = consecutive[temp];
                }

                if (maxLen < count) {
                    maxLen = count;
                }
                count = 0;
            }
        }

        return maxLen;
    }
};
