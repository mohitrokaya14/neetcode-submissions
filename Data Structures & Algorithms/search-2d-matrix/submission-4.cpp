class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int l=0,r=matrix.size()-1,mid,m,b=matrix[0].size()-1;
        while(l<=r){
            mid = (l+r)/2;
            if(matrix[mid][0]<=target && matrix[mid][b]>=target){
                l = 0;
                while(l<=b){
                    m = (l+b)/2;
                    if(matrix[mid][m]==target){
                        return true;
                    }else if(matrix[mid][m]<target){
                        l = m + 1;
                    }else{
                        b = m - 1;
                    }
                }
                return false;
            }else if(matrix[mid][0]>target){
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
};
