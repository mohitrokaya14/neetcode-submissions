class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i=0;
        int[] res = new int[2];
        for(int num : nums){
            if(hash.get(num)!=null){
                res[0] = hash.get(num);
                res[1] = i;
                return res;
            }
            hash.put(target-num,i);
            i++;
        }
        return res;
    }
}
