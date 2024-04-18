class Solution {
    public int findMinArrowShots(int[][] points) {
      int n = points.length;
    if (n == 0) return 0;

    // Sort intervals based on their ending points
    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

    int arrows = 1; // Initialize with one arrow as we'll always need at least one
    int end = points[0][1];

    // Iterate through the intervals and find the minimum number of arrows required
    for (int i = 1; i < n; i++) {
        // If the current balloon starts after the previous one ends, we need an extra arrow
        if (points[i][0] > end) {
            arrows++;
            end = points[i][1];
        }
    }
    return arrows;
}
    
}
/*
(1,6) (2,8) (7,12) (10,16)
(1,8) (7,16)->1

(1,2) (2,3) (3,4) (4,5)
(1,3)(3,5)->1
(1,5)->2

* */