// Problem: 950. Count number of odd digits in a number
// Link: https://takeuforward.org/practice/dsa/count-number-of-odd-digits-in-a-number

class Solution {
    public int countOddDigit(int n) {
      if(n==0){
        return 0;
      }
      int count=0;
      while(n>0){
        int ld=n%10;
        if(ld%2!=0){
            count++;
        }
        n=n/10; 
      }
      return count;
    }
}
