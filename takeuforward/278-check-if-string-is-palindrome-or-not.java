// Problem: 278. Check if String is Palindrome or Not
// Link: https://takeuforward.org/practice/dsa/check-if-string-is-palindrome-or-not-

class Solution {   
    public boolean palindromeCheck(String s) {
       return helper(s,0);        
        
    }
    public boolean helper(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)==s.charAt(s.length()-i-1)){
           return helper(s,++i);
        }
        return false;
    }
}
