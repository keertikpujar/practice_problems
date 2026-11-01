// Problem: 921. Factorial of a Given Number
// Link: https://takeuforward.org/practice/dsa/factorial-of-a-given-number-ii

class Solution {
    public long factorial(int n) {
        if(n==0||n==1) return 1;
        else {
            return factorial(n-1)*n;
        }
        
    }
}
