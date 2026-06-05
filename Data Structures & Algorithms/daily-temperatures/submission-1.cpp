class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<pair<int, int>> st; // pair: {temperature, index}
        vector<int> result(temperatures.size(), 0);

        for (int i = 0; i < temperatures.size(); i++) {
            while (!st.empty() && temperatures[i] > st.top().first) {
                int prevIndex = st.top().second;
                st.pop();
                result[prevIndex] = i - prevIndex;
            }
            st.push({temperatures[i], i});
        }

        return result;
    }
};
