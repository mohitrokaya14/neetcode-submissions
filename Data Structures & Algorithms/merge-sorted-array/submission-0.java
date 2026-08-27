class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        
        n=n-1;
        while(n>=0&&m<nums1.length){
            nums1[m] = nums2[n];
            m++;
            n--;
        }

        Arrays.sort(nums1);
    }
}