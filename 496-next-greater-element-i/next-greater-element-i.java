
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // HashMap to store the next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        // Stack to help find the next greater element
        Stack<Integer> st = new Stack<>();
        
        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            // Maintain elements in the stack where the top is always the next greater element
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();//if it is small then no need bcz we need larger element
            }
            // If the stack is empty, there's no greater element; otherwise, the top of the stack is the next greater element
            if (st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());
            
            // Push the current element to the stack
            st.push(nums2[i]);
        }
        
        // Prepare the result array
        int[] result = new int[nums1.length];
        for (int j = 0; j < nums1.length; j++) {
            // Get the next greater element from the map
            result[j] = map.get(nums1[j]);
        }
        
        return result;
    }
}
