class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        vector<pair<int,int>>hs;
        stack<double>st;
        int r = position.size() - 1;
        double temp = 0;

        for(int i = 0; i<position.size();i++){
            hs.push_back({position[i],speed[i]});
        }
        sort(hs.begin(),hs.end());

        st.push((double)(target - hs[r].first)/hs[r].second);
        for(int i = r-1;i >= 0;i--){
            temp = (double)(target - hs[i].first)/hs[i].second;
            if(st.top()<temp){
                st.push(temp);
            }
        }
        return st.size();
    }
};
