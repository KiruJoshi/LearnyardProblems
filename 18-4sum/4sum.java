class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        double sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int p = j + 1, q = n - 1;
                while (p < q) {
                    sum = ((double)nums[i] + (double)nums[j] + (double)nums[p] +(double)nums[q]);
                    if (target == sum) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        while (p + 1 < q && nums[p] == nums[p + 1])
                            p++;
                        while (q - 1 > p && nums[q] == nums[q - 1])
                            q--;
                        p++;
                        q--;
                    } else if (sum < target)
                        p++;
                    else
                        q--;
                }
                while (i + 1 < n && nums[i] == nums[i + 1])
                    i++;
                while (j + 1 < n && nums[j] == nums[j + 1])
                    j++;
            }
        }
        return result;
    }
}