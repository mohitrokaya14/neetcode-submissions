class Solution {
    public void rotate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        k %= n;
        for(int i=0;i<n;i++){
            map.put(i,nums[(n+i-k)%n]);
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = map.get(i);
        }

    }
}