class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int numDecodings(String s) {
        return helper(s,0);
    }   

    
    public int helper(String s,int i){
        if(map.containsKey(i)){
            return map.get(i);
        }

        if(i>=s.length()){return 1;}
        
        if(s.charAt(i)=='0'){
            return 0;
        }
        int left = helper(s,i+1);
        if(i+1>=s.length()){return 1;}
        int val = Integer.parseInt(s.substring(i,i+2));
        if(val>26||val<10){
            return left;
        }
        int right = helper(s,i+2);

        int ways = right + left;

        map.put(i,ways);
        return ways;
    }
}
