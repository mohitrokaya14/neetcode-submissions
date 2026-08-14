class Solution {
    HashMap<Integer,Integer> dp = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        int fewest = helper(coins,amount);
        if(fewest==Integer.MAX_VALUE){
            return -1;
        }
        return fewest;
    }
    int sub;
    public int helper(int[] coins,int a){
        if(dp.containsKey(a)){
                return dp.get(a);
            }
        int min = Integer.MAX_VALUE;
        if(a==0){
            return 0;
        }

        if(a<0){
            return Integer.MAX_VALUE;
        }

        for(int coin : coins){
           
            sub = helper(coins, a-coin);
            if(sub != Integer.MAX_VALUE){
                min = Math.min(min, sub+1);
            }
            
        }
        dp.put(a,min);
        return min;
    }
}
