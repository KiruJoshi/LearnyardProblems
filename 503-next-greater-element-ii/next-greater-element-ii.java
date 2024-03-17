class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> st = new Stack<>();
        st.push(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            st.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                result[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return result;
    }
}