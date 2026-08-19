class Solution {
    HashMap<String,Boolean> map = new HashMap<>();
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        return helper(sum/2,0,nums);
    }
    public boolean helper(int sum,int i,int[] nums){
        if(map.containsKey(sum+","+i)){
            return map.get(sum+","+i);
        }
        if(sum == 0){return true;}
        if(i==nums.length){return false;}
        if(sum<0){return false;}

        boolean canbe = helper(sum-nums[i],i+1,nums) || helper(sum,i+1,nums);
        
        map.put(sum+","+i,canbe);
        return canbe;
    }
}
