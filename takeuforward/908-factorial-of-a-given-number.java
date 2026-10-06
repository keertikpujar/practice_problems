// Problem: 908. Factorial of a given number
// Link: https://takeuforward.org/practice/dsa/factorial-of-a-given-number-i

class Solution {
    public int factorial(int n) {
        if(n==0||n==1){
            return 1;
        }
        int fact=n*factorial(n-1);

    
    return fact;
    }
}
