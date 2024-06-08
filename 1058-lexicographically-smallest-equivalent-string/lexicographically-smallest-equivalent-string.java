class UnionFind {
    int[] par;
    int[] size;
    int numComponents;

    UnionFind(int n) {
        par = new int[26];
        size = new int[26];
        numComponents = n;
        for(int i = 0; i < 26; ++i) {
            par[i] = i;
            size[i] = 1;
        }
    }

    int root(int i) { // find the root of the tree in which node i is present
        if(par[i] == i)
            return i;
        return root(par[i]); // path compression
    }

    boolean union(int n1, int n2) { // true if they were actually unioned, otherwise false
        int u = root(n1);
        int v = root(n2);

        if(u == v)
            return false;

        if(v < u){
           int temp = u;
           u = v;
           v = temp; 
        }

        par[v] = u; // u is the root of resultant tree
        size[u] += size[v];
        numComponents -= 1;
        return true;
    }
} 

class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind dsu = new UnionFind(s1.length());
        // dsu.union(1, 2);
        for(int i=0;i<s1.length();i++){
            dsu.union(s1.charAt(i)-'a', s2.charAt(i)-'a');
        }
        StringBuilder finalStr = new StringBuilder();

        for(int i=0;i<baseStr.length();i++){
            char c = (char)(dsu.root(baseStr.charAt(i)-'a')+97);
            finalStr.append(c);
        }
        return finalStr.toString();
    }
}

// a=a
// c=a
// d=b
// eed
// (p,m)(a,o)(r,r)(k,r)(e,i)(r,s) parser=parser
// p=m
// a=o
// k=r=s//by 3rd rule
// e=i
// makkek
