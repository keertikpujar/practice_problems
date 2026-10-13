// Problem: 957. Return the Largest Digit in a Number
// Link: https://takeuforward.org/practice/dsa/return-the-largest-digit-in-a-number

class Solution {
    public int largestDigit(int n) {
        int largestDigit=0;
        while(n>0){
            int lastd=n%10;
            n=n/10;
            if(lastd>largestDigit)
                largestDigit=lastd;
            
        }
        return largestDigit;
    }
}
