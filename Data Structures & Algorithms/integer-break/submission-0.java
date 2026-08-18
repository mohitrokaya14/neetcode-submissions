class Solution {
    int[] arr = new int[59];
    public int integerBreak(int n) {
        return helper(n,n);
    }
    public int helper(int num,int n){
        if(n<0){
            return Integer.MIN_VALUE;
        }
        if(n==0){
            return 1;
        }
        
        if(arr[n]!=0){
            return arr[n];
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<num;i++){
            int prod = helper(num,n-i);
            if(prod!=Integer.MIN_VALUE){
                max = Math.max(max,prod*i);
            }
        }
        arr[n] = max;
        return max;
    }
}