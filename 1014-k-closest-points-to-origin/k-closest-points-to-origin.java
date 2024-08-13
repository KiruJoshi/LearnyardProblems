class Custom{
    public int x;
    public int y;
    public Custom(int x, int y){
        this.x=x;
        this.y =y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Custom> pq = new PriorityQueue<>(new Comparator<Custom>(){
            @Override
            public int compare(Custom a, Custom b){
                int d1 = (a.x * a.x) + (a.y*a.y);
                int d2 = (b.x*b.x) + (b.y*b.y);

                if(d1 < d2 ) return -1;
                else if(d1>d2) return 1;
                return 1;
            }
        });

        for(int[] num: points){
            Custom custom = new Custom(num[0],num[1]);
            pq.add(custom);
        }

        int ans[][] = new int[k][2];
        for(int row=0;row<k;row++){
            Custom cus = pq.remove();
            ans[row][0] =cus.x;
            ans[row][1] = cus.y;
        }
        return ans;
    }
}
