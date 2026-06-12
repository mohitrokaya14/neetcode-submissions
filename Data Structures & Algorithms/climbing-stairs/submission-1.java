class Solution {
    public int climbStairs(int n) {
        int way=0;
        int a=0,b=1;
        for(int i=0;i<n;i++){
            way = a+b;
            a=b;
            b=way;

        }
        return way;
    }
}
