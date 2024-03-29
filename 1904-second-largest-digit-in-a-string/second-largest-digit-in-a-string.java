class Solution {
    public int secondHighest(String s) {
        int firstHighest = -1;
        int secondHighest = -1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) 
            {
                int digit = s.charAt(i) - '0';
                if (digit > firstHighest) 
                {
                    secondHighest = firstHighest;
                    firstHighest = digit;
                } else 
                if (digit < firstHighest && digit > secondHighest) 
                {
                    secondHighest = digit;
                }
            }
        }
        return secondHighest;
    }
}