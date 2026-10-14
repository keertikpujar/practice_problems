// Problem: 792. LCM of two numbers
// Link: https://takeuforward.org/practice/dsa/lcm-of-two-numbers

class Solution {
    public int LCM(int n1, int n2) {
          int gcd=GCD(n1,n2);
          int lcm=(n1*n2)/gcd;
          return lcm;
    }
    public int GCD(int n1,int n2){
            if(n1==0 ||n2==0)
              return 0;
            
            while(n1!=0&&n2!=0){
                if(n1>n2){
                    n1=n1%n2;
                }
                else{
                    n2=n2%n1;
                }
            }
            return Math.max(n1,n2);
    }

}
