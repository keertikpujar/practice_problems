// Problem: 299. Fibonacci Number
// Link: https://takeuforward.org/practice/dsa/fibonacci-number

class Solution {
    public int fib(int n) {
        int sum;
        if (n==0) return 0;
        else if (n==1) return 1;
        else{
             sum=fib(n-2) + fib(n-1);
        }
        return sum;
       
    }
}
