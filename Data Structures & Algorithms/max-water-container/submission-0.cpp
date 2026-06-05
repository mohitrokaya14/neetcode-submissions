class Solution {
public:
    int maxArea(vector<int>& heights) {
        int left = 0,right = heights.size()-1,area,m=0;
        while(left<right){
            area = (right - left)*min(heights[right],heights[left]);
            if(heights[right]>heights[left]){
                left++;
            }else{
                right--;
            }
            m = max(m,area);
        }
        return m;
    }
};
