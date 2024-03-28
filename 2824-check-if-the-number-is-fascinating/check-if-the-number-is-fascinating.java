class Solution {
    public boolean isFascinating(int n) {

        String str = String.valueOf(n).concat(String.valueOf((2 * n))).concat(String.valueOf(3 * n));
     
          HashSet<Integer> set = new HashSet<>();
        if (str.length() > 9 || str.length() < 9)
            return false;
        for (int i = 0; i < str.length(); i++) {
            set.add(Integer.valueOf(str.charAt(i) - '0'));
        }
        System.out.println(set);
        if (set.contains(0)) {
            return false;
        }
        for (int i = 1; i < 10; i++) {
            if (!(set.contains(i))) {
                return false;
            }
        }
        return true;
    }
}
