class Solution {
    public boolean isHappy(int n) {

        int rem = 0, ans = 0, temp = 0;
 
        while (n > 1) {
            ans = 0;
            if (n == 4) {
                return false;
            }
            while (n > 0) {// 19
                rem = n % 10;// 9
                ans+= (rem * rem);// 82
                n = n / 10;// 1
            }
            n = ans;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }
}

/*
 * 4->16
 * 7-49-> 97->130->
 */