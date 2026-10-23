// Problem: 779. Check for Prime Number
// Link: https://takeuforward.org/practice/dsa/check-for-prime-number

class Solution {
    public boolean isPrime(int n) {
        if (n==1) return false;
        int a=2;
        while(a<n){
            if(n%a==0)
             return false;
            a++;
        }
        return true;
    }
}
