class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int right = numbers.size()-1,left = 0;
        for(int i = 0;i<numbers.size();i++){
            if(numbers[right]+numbers[left]==target&&right!=left){
                return {left+1,right+1};
            }
            else if(numbers[right]+numbers[left]>target){
                right--;
            }else{
                left++;
            }
        }
        return{};
    }
};
