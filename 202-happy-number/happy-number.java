class Solution {
    public boolean isHappy(int n) {

        int sum = 0, rem = 0, ans = 0, temp = 0;
        if (n == 1 || n == 7)
            return true;
        while (n > 1) {
            ans = 0;
            if (n == 4) {
                return false;
            }
            while (n > 0) {// 19
                rem = n % 10;// 9
                temp = rem;// 9
                ans+= (temp * temp);// 82
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