class Solution {
    public boolean checkStraightLine(int[][] c) {
        if (c.length == 2) {
            return true;
        }
        boolean flag1 = true, flag2 = true;
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1][0] != c[i][0]) {
                flag1 = false;
            }
        }
        if (flag1) {
            return true;
        }
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1][1] != c[i][1]) {
                flag2 = false;
            }
        }
        if (flag2) {
            return true;
        }
        if (!flag1) {
            double slope = (double) (c[1][1] - c[0][1]) / (c[1][0] - c[0][0]);
            for (int i = 2; i < c.length; i++) {
                if (c[i][0] - c[i - 1][0] == 0) {
                    return false; // Division by zero error
                }
                double temp = (double) (c[i][1] - c[i - 1][1]) / (c[i][0] - c[i - 1][0]);
                if (temp != slope)
                    return false;
            }
        }
        return true;
    }
}