public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
    // Pad the binary string with leading zeros to ensure it has length 32
        while (str.length() < 32) {
            str.insert(0, '0');
        }

        // Reverse the binary string
        str.reverse();

        // Parse the reversed binary string to get the result
        return Integer.parseUnsignedInt(str.toString(), 2);
    }
} 