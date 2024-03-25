class Solution {
    public int mostFrequentEven(int[] nums) {

        int n = nums.length;
        int freq = 0, res = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                ans = Math.max(ans, map.get(nums[i]));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          //  System.out.println(entry.getKey() + " " + entry.getValue() + " " + ans);
            if (entry.getValue() == ans) {
                res = Math.min(res, entry.getKey());
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }
}