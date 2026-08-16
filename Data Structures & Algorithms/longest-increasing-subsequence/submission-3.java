class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();
    public int lengthOfLIS(int[] nums) {
        return helper(nums,Integer.MIN_VALUE,0);
    }

    public int helper(int[] nums,int last, int i){
        String key = last+","+i;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(i==nums.length){
            return 0;
        }
        
        if(last>=nums[i]){
            return helper(nums,last,i+1); 
        }

        int max = Math.max(helper(nums,nums[i],i+1)+1,helper(nums,last,i+1));
        map.put(key,max);
        return max;
    }
}
