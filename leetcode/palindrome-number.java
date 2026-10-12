// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int revnum=0;
        while(x>0){
            int lastDigit=x%10;
            x=x/10;
            revnum=(revnum*10)+lastDigit;
        }
        if(revnum==n) return true;
        else return false;

    }
}
