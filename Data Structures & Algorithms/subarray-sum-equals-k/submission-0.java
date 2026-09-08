class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum=0;
        for(int num : nums){
            sum+=num;
            if(sum-k==0){
                count++;
            }
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            if(!map.containsKey(sum)){map.put(sum,0);}
            map.put(sum,map.get(sum)+1);
        }
        return count;
    }
}