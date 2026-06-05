class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(int num : nums){
            if(heap.size()==k){
                if(heap.peek()<num){
                    heap.poll();
                    heap.offer(num);
                }
            }else{
                heap.offer(num);
            }
        }
        return heap.poll();
    }
}
