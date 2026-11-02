// Problem: 801. Check if a Number is Prime or Not
// Link: https://takeuforward.org/practice/dsa/check-if-a-number-is-prime-or-not

class Solution {
    public boolean checkPrime(int num) {
        int count=0;
      return helper(num,3);     

    }
    public boolean helper(int n,int a){
       if(n==1||n==0||(n>2&&n%2==0)) return false;
       else if(n==2) return true;
       while(a<=Math.sqrt(n)){
        if(n%a==0) return false;
        a++;
       }
       return true;
    }
}
