class Solution {
    public long carHelper(int ranks[], long mid) {
        long noOfCars = 0;
        for (int i = 0; i < ranks.length; i++) {
            noOfCars += (long)Math.floor(Math.sqrt(mid / ranks[i]));
        }
        return noOfCars;
    }

    public long repairCars(int[] ranks, int cars) {
        long lo = 1, high = ranks[0] * (long) cars * cars;
        long ans=high;
        while (lo <= high) {
            long mid = lo + (high - lo) / 2; // Prevent overflow
            long noOfCars = carHelper(ranks, mid);
            if (noOfCars >= cars){
                high = mid - 1;
                ans=Math.min(ans,mid);
              }  else
                lo = mid + 1;
        }
        return lo;
    }
}

/*
 * find search space
 * helper method
 * if-else conditions
 ans variable
 */