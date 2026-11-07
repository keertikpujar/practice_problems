// Problem: Largest Odd Number in String
// Link: https://leetcode.com/problems/largest-odd-number-in-string/

class Solution {
    public String largestOddNumber(String num) {
        // Traverse the string from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character represents an odd digit
            if ((num.charAt(i)-'0' ) % 2 != 0) {
                // Return the substring from index 0 to i (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}
