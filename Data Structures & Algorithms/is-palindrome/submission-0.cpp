class Solution {
public:
    bool isPalindrome(string s) {
        string str="";
        int left,right;

        for(char c:s){
            if(isalnum(c)){
                str += tolower(c);
            }
        }
        left=0;
        right=str.size()-1;
        while(left<right){
            if(str[right]!=str[left]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};
