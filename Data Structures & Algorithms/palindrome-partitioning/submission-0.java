class Solution {
    List<List<String>> output = new ArrayList<>();
    List<String> part = new ArrayList<>();
    public List<List<String>> partition(String s) {
        parting(s,0);
        return output;
    }

    public void parting(String s,int i){
        if(i==s.length()){
            output.add(new ArrayList<>(part));
            return;
        }
        for(int j=1+i;j<=s.length();j++){
            String temp = s.substring(i,j);
            if(palin(temp)){
                part.add(temp);
                parting(s,j);
                part.remove(part.size()-1);
            }
        }
    }
    public boolean palin(String s){
        int l=0;
        int r=s.length()-1;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
    }
}
