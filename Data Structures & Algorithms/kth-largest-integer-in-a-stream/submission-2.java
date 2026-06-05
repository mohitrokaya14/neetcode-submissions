class KthLargest {
    int res;
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
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
    }
    
    public int add(int val) {
        if(heap.size()<k){heap.offer(val);}
        else if(heap.peek()<val){
            heap.poll();
            heap.offer(val);
        }
        return heap.peek();
    }
}
