class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
        }
        int a=0,b=0;
        while(maxHeap.size()>1){
            a = maxHeap.poll();
            b = maxHeap.poll();
            if(a!=b){maxHeap.offer(a-b);}
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
