// Problem: 693. GCD of Two Numbers
// Link: https://takeuforward.org/practice/dsa/gcd-of-two-numbers


class Solution {
    public int GCD(int n1, int n2) {
        if(n1==0||n2==0){
            return 0;
        }
        while(n1!=0&&n2!=0){
        if(n1>n2){
             n1=n1%n2;
        }
        else{
             n2=n2%n1;
        }
        }
        if(n1!=0){
            return n1;
        }
        else
            return n2;


    }
}
