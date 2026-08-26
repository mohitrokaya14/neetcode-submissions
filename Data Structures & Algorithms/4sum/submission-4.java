class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    }

                    if(sum<target){l++;}
                    if(sum>target){r--;}
                }
            }
        }
        return new ArrayList<>(set);
    }
}