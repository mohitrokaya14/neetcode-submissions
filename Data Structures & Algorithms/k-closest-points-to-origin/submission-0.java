class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a,b)->Integer.compare(a[1],b[1])
        );
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = x*x+y*y;
            heap.offer(new int[]{i,dist});
        }
        int[][] res = new int[k][2];
        for(int i=0;i<k;i++){
            int idx = heap.poll()[0];
            res[i] = points[idx];
        }
        return res;
    }
}
