class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int r=0,l=1,s=0,mid,result=1;
        for(int i = 0;i<piles.size();i++){
            r = max(r,piles[i]);
        }
        int c = r*piles.size();
        while(l<=r){
            s = 0;
            mid=(l+r)/2;
            for(int i=0;i<piles.size();i++){
                s = s + piles[i]/mid;
                if(piles[i]<mid){
                    s++;
                }else if(piles[i]%mid!=0){
                    s++;
                }
            }
            
            // if(s<=h){
            //     result = mid;
            // }
            if(s>h){
                l = mid+1;
            }else{
                r = mid -1;
                result = mid;
            }
        }
        return result;
    }
};
