// Problem: 341. Largest Odd Number in a String
// Link: https://takeuforward.org/practice/dsa/largest-odd-number-in-a-string

class Solution {
    public String largeOddNum(String s) {
        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((s.charAt(i) - '0') % 2 != 0) {
                // Find the first non-zero character to avoid leading zeros
                int start = 0;
                while (start <= i && s.charAt(start) == '0') {
                    start++;
                }
                
                // If all characters up to i are zeros, return empty string
                if (start > i) {
                    return "";
                }
                
                // Return the valid substring without leading zeros
                return s.substring(start, i + 1);
            }
        }
        return "";
    }
}
