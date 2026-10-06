// Problem: 781. Count all Digits of a Number
// Link: https://takeuforward.org/practice/dsa/count-all-digits-of-a-number?sidebar=0

class Solution {
    public int countDigit(int n) {
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
             n=n/10;
            count++;
        }
        
        

        return count;

    }
}
