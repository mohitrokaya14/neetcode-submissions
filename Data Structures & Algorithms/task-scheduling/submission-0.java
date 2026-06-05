class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }

        int hFreq=0;
        for(int f : freq){
            hFreq = Math.max(hFreq,f);
        }

        int count=0;
        for(int f : freq){
            if(hFreq == f){
                count++;
            }
        }
        //X--X--X
        return Math.max(tasks.length,(hFreq-1)*n + hFreq + count-1);
    }
}
