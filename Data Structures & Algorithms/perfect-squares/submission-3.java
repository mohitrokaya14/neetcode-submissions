class Solution {
    int[] arr = new int[10001];
    public int numSquares(int n) {
        for(int i=0;i<n;i++){
            helper(i);
        }
        return helper(n);
    }
    
    public int helper(int n){
        if(arr[n]!=0){
            return arr[n];
        }
        if(n==0){return 0;}

        if(n<0){return Integer.MAX_VALUE;}

        int min = Integer.MAX_VALUE;
        
        for(int i=1;i*i<=n;i++){
            int square = i*i;
            int num = helper(n-square);
            if(num != Integer.MAX_VALUE){
                min = Math.min(min ,num+1);
            }
        }
        arr[n]=min;
        return min;
    }
}