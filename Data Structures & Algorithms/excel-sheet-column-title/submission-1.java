class Solution {
    public String convertToTitle(int columnNumber) {

        int division = columnNumber;
        String title = "";
        char c;
        int mod;
        while(division>0){
            division--;

            mod = division%26;
            c = (char)('A' + mod);
            title = c + title;

            division = division/26;
        }
        return title;
    }
}