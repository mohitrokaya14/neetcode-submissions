class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int>hash; 
        int r=0, l=0,greatest=0,g=0,gt=0;
        for(r;r<s.length();r++){
            hash[s[r]]++;

            gt = max(gt,hash[s[r]]);

            //cout<<hash[s[0]]<<" "<<hash[s[6]]<<endl;
            
            if((r-l+1) - gt > k){
                hash[s[l]]--;
                l = l + 1;
            }
            
            greatest = max(greatest,r-l+1);
            
            //cout<<l<<" "<<r<<endl;
        }
        return greatest;
    }
};
