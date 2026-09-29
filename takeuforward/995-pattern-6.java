// Problem: 995. Pattern 6
// Link: https://takeuforward.org/practice/dsa/pattern-6

import java.util.Scanner;
class Solution {
    public void pattern6(int n) {
      for ( int i=0;i<n;i++){
        for (int j=1;j<n+1-i;j++){
            System.out.print(j);
        }
        System.out.println();
      }

    }
    public  void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        pattern6(n);
    }
}
