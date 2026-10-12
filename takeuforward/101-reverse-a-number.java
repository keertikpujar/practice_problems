// Problem: 101. Reverse a number
// Link: https://takeuforward.org/practice/dsa/reverse-a-number

class Solution {
    public int reverseNumber(int n) {
        int revnum=0;
        while(n>0){
           int lastDigit=n%10;
           n=n/10;
            revnum=(revnum*10) + lastDigit;
        }
        return revnum;
    }
}
