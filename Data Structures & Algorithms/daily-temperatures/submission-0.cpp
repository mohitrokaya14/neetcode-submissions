class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<vector<int>>st;
        vector<int>result(temperatures.size());

        for(int i=0;i<temperatures.size();i++){
            while(!st.empty() && temperatures[i]>st.top()[0]){
                result[st.top()[1]]=i-st.top()[1];
                st.pop();
            }
            st.push({temperatures[i],i});
       }
       return result;
    }
};
