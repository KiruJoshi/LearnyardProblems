class KthLargest {
    PriorityQueue<Integer> pq ;
    int k;
    public KthLargest(int k, int[] nums) {
       pq = new PriorityQueue<>();
       this.k=k;
        for (int num : nums) {
           add(num);
        }
    }

    public int add(int val) {
        if(pq.size()<k){
            pq.add(val);
        } else if(val > pq.peek()){
            pq.poll();
            pq.add(val);
        }
       return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);


 [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 2 3 4 4 5 5 8 9 10
 output-4 5 5 8 8
 2
 4
 5
 8
 */