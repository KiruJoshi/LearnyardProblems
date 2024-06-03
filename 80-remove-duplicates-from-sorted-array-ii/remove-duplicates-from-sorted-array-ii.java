class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getValue() >= 2) {
                list.add(ele.getKey());
                list.add(ele.getKey());
            } else {
                list.add(ele.getKey());
            }
        }
        Arrays.fill(nums, 10101);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        int size = 0;
        for (int value : nums) {
            if (value != 10101)
                size++;
        }
        return size;
    }
}