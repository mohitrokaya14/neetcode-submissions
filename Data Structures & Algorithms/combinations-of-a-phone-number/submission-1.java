class Solution {
    HashMap<Character,String> hash = new HashMap<>();
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }
        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");
        helper(digits,0);
        return res;
    }
    String com="";
    public void helper(String digits,int i){
        if(i==digits.length()){
            res.add(new String(com));
            return;
        }

        String s = hash.get(digits.charAt(i));
        for(int j=0;j<s.length();j++){
            com+=s.charAt(j);
            helper(digits,i+1);

            com=com.substring(0,com.length()-1);
        }
    }
}
