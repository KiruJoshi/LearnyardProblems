class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int sum=0;
        int arr[] = new int[nums1.length + nums2.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < nums1.length)
                arr[i] = nums1[i];
            else
                arr[i] = nums2[j++];
        }
        Arrays.sort(arr);
        if (arr.length % 2 == 1)
            ans = arr[arr.length / 2];
        else {
            sum = arr[(arr.length / 2) - 1] + arr[arr.length / 2];
            ans = (double) sum / 2;
        }
        return ans;
    }
}