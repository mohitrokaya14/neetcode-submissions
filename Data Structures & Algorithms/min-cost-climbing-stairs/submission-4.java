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
        int i;
        for(i=2;i<cost.length;i++){
            cost[i] = Math.min(cost[i-2],cost[i-1])+cost[i];
        }
    return Math.min(cost[i-1],cost[i-2]);
    }
}
