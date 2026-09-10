class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] set = new boolean[100001];
        int i=1;

        for(int num:nums){
            if(num>0&&num<=100000){
                set[num] = true;
            }
        }    

        while(i<=nums.length){
            if(set[i]==false){
                return i;
            }
            i++;
        }
        return i;
    }
}