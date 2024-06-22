class Edge {
    int node;
    int weight;

    Edge(int n, int w) {
        node = n;
        weight = w;
    }
}

class Node {
    int node;
    long dist;

    Node(int n, long d) {
        node = n;
        dist = d;
    }
}

class Solution {
    List<List<Edge>> adjList = new ArrayList<>();

    public int[] dijasktra(int src, int n){
        int d[]=new int[n+1];
        Arrays.fill(d,Integer.MAX_VALUE);
        d[src]=0;
        PriorityQueue<Node> pq = new PriorityQueue<>(n, new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                if(n1.dist > n2.dist) {
                    return 1;
                } else if(n1.dist == n2.dist && n1.node == n2.node) {
                    return 0;
                }
                return -1;
            }
        });
        pq.add(new Node(src,0));
        while(!pq.isEmpty()){
            int currNum=pq.peek().node;
            long currDist=pq.poll().dist;
            for(Edge e:adjList.get(currNum)){
                 int nb=e.node;
                 int weight=e.weight;
                 if(d[nb]>d[currNum]+weight){//comparing
                    d[nb]=d[currNum]+weight;//updating nb
                    pq.add(new Node(nb,d[nb]));
                 }   
               }
            }
        return d;   
     }

    public int networkDelayTime(int[][] times, int n, int k) {

        for (int i = 0; i <=n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] arr : times) {
            int u = arr[0];
            int v = arr[1];
            int w = arr[2];
            adjList.get(u).add(new Edge(v, w));
        }
        int d[] = dijasktra(k, n);
        int minValue=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
          //  System.out.println("d= "+d[i]);
            if(d[i]==Integer.MAX_VALUE){
                return -1;
            }
            minValue=Math.max(minValue,d[i]);
        }
        return minValue;
    }
}

/*
 * positive-dijask
 * negative-belmond ford/warhshal
 */