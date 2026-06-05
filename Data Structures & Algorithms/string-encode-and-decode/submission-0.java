class Solution {
    HashMap<String, List<String>> hash = new HashMap<>();
    public String encode(List<String> strs) {
        String encoded="";
        for(String str : strs){
            encoded += str;
        }
        hash.put(encoded,strs);
        return encoded;
    }

    public List<String> decode(String str) {
        return hash.get(str);
    }
}
