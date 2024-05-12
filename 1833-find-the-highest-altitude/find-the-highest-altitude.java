class Solution {
    public int largestAltitude(int[] gain) {
        int max_ele = Integer.MIN_VALUE;
        int pref[] = new int[gain.length+1];
        pref[0] = 0;
        for (int i = 1; i<=gain.length; i++) {
            pref[i] = pref[i-1] + gain[i - 1];
        }
        for (int i = 0; i < pref.length; i++) {
          max_ele = Math.max(pref[i], max_ele);
        }
        System.out.println(Arrays.toString(pref));
        return max_ele;
    }
}