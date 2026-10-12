// Problem: Armstrong Numbers
// Link: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static boolean armstrongNumber(int n) {
        int realnum=n;
        int sum=0;
         while(n>0){
             int lastdigit=n%10;
             n=n/10;
             sum=sum+(lastdigit*lastdigit*lastdigit);
         }
         if(sum==realnum) return true;
         else return false;
    }
}
