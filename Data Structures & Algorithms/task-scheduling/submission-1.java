class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }

        int max = 0;
        int count = 0;
        for(int i=0;i<26;i++){
            max = Math.max(freq[i],max);
        }

        for(int i=0;i<26;i++){
            if(freq[i]==max){
                count++;
            }
        }

        int calc = (max-1)*n + max + count-1;

        if(tasks.length>calc){
            return tasks.length;
        }else{
            return calc;
        }
    }
}
