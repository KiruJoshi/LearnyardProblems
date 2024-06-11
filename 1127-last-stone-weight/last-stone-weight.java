class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
            int ans = 0;

        for(int num: stones)
            pq.add(num);
    //    System.out.println(pq);
        while(pq.size()>1){
           int y = pq.poll();
            int x = pq.poll();
            pq.add(y-x);

        }
        ans = pq.poll();
        return ans ;
    }
}