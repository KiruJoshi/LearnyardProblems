class Solution {
    public int numberOfChild(int n, int k) {
        int ans = 0;
        boolean forward = true;
        while (k-- > 0) {
            if (forward) {//forward
                ans++;
                if (ans == (n - 1))
                    forward = false;
            } else {//backward
             ans--;
                 if (ans == 0)
                  forward = true;
            }

        }
        return ans;
    }
}