// Problem: 745. Check for Perfect Number
// Link: https://takeuforward.org/practice/dsa/check-for-perfect-number

class Solution {
    public boolean isPerfect(int n) {
        int sum=0;
        int a=1;
        while(a<n){
            if(n%a==0)  sum=sum+a;
            a++;
        }
        if(sum==n) return true;
        else return false;

    }
}
