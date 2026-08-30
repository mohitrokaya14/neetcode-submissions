class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int num:nums){
            if(!freq.containsKey(num)){
                freq.put(num,1);
                continue;
            }
            freq.put(num,freq.get(num)+1);
        }

        for(int num:nums){
            if(freq.get(num)>nums.length/3){
                res.add(num);
                freq.put(num,0);
            }
        }

        return res;
    }
}