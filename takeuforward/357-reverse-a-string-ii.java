// Problem: 357. Reverse a String II
// Link: https://takeuforward.org/practice/dsa/reverse-a-string-ii?tab=problem

class Solution {
    public void reverseString(List<Character> s) {
      int left = 0;
        int right = s.size() - 1;
        
        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
