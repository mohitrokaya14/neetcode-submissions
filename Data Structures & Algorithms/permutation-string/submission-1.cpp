class Solution {
public:
    bool checkInclusion(string s1, string s2) {
    unordered_map<char , int>hs1;
    unordered_map<char , int>hs2;
    int r=0,l=0,c=0;

    for(int i =0;i<s1.size();i++){
        hs1[s1[i]]++;
    }
    
    for(int r=0;r<s2.size();r++){
        //cout<<l<<" "<<r<<" "<<r-l+1<<endl;
        hs2[s2[r]]++;
        if(hs1.count(s2[r])){
            if(hs2[s2[r]]<=hs1[s2[r]]){
                //cout<<l<<" "<<r<<" "<<r-l+1<<endl;
                if(r-l+1==s1.length()){
                    return true;
                }
            }else{
                while(hs1[s2[r]]<hs2[s2[r]]){
                    hs2[s2[l]]--;
                    l++;
                }
            }
        }else{
            while(l < r+1){
                hs2[s2[l]]--;
                l++;
            }
        }
    }
    return false;
    }
};
