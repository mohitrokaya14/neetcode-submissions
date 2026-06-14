class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min=0;
        int len = cost.length;
        int[] index = new int[cost.length+1];
        if(len<2){
            return 0;
        }if(len==2){
            return Math.min(cost[1],cost[0]);
        }
        index[0] = 0;
        index[1] = 0;
        int i;
        for(i=2;i<index.length;i++){
            index[i] = Math.min(cost[i-2]+index[i-2],cost[i-1]+index[i-1]);
        }
    return index[i-1];
    }
}
