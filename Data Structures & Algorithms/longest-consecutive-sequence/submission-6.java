class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>freq = new HashSet<>();
        int max=1;
        if(nums.length==0){
            return 0;
        }
        for(int num : nums){
            freq.add(num);
        }
        for(int num : nums){
            if(freq.contains(num-1)){
                continue;
            }
            int count=1;
            while(freq.contains(num+1)){
                count++;
                max = Math.max(max,count);
                num+=1;
            }
        }
        return max;
    }
}
