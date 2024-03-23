class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int result[] = new int[n];
       // int i = 0, j = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {//74>73
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
              int idx = stack.pop();
              result[idx] = i - idx;
            }
            stack.push(i);//73
        }
        return result;
    }
}