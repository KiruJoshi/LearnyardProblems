class Solution {
    public int pivotInteger(int n) {

        if (n == 1) {
            return 1;
        }
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        int result[] = new int[arr.length];
        result[0] = arr[0];
        int sum = 0, sum_arr = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_arr += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
            if (result[i] == sum_arr - result[i - 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}