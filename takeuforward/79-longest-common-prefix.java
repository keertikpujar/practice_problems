// Problem: 79. Longest Common Prefix
// Link: https://takeuforward.org/practice/dsa/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        
        // Assume the first string is the longest common prefix initially
        String prefix = str[0];
        
        for (int i = 1; i < str.length; i++) {
            // Check while the current string does not start with the prefix
            while (str[i].indexOf(prefix) != 0) {
                // Reduce the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
