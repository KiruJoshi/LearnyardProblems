class Solution {
    public void duplicateZeros(int[] arr) {
       int zeros = 0;
    int length = arr.length;

    // adjust positions
    for (int i = 0; i < length; i++) {
        if (arr[i] == 0) {
            zeros++;
        }
    }

    // Adjust positions for in-place duplication
    for (int i = length - 1; i >= 0; i--) {
        if (i + zeros < length) {
            arr[i + zeros] = arr[i];
        }

        if (arr[i] == 0) {
            zeros--;
            if (i + zeros < length) {
                arr[i + zeros] = 0;
            }
        }
    }
}
}