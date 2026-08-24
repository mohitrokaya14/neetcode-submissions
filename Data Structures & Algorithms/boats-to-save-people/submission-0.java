class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r=people.length-1;
        int l=0;
        int boats=0;

        while(r>=l){
            if(people[r]+people[l]<=limit){
                l++;
                r--;
            }else{
                r--;
            }
            boats++;
        }

        return boats;
    }
}