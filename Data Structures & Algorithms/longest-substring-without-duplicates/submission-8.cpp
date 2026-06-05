class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int>hash;
        
        int l = 0,r=0,temp=0,greatest=1;
        if(s.length()==0){
            return 0;
        }
        while(r!=s.length()){
            if((hash.count(s[r]))&&(hash[s[r]]>=l)){
                l = hash[s[r]]+1;
                hash[s[r]] = r;
                r = r + 1;
            }else{
                hash[s[r]] = r;
                r = r+1;
            }
            greatest = max(greatest , r - l);
        }
        return greatest;
    }
};
