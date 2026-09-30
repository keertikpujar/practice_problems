// Problem: 1006. Pattern 8
// Link: https://takeuforward.org/practice/dsa/pattern-8

import java.util.Scanner;
class Solution {
    public static void pattern8(int n) {
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            //for(int j=0;j<=i;j++){
              //  System.out.print(" ");
            //}
            System.out.println();
        }

    }
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      int n = scan.nextInt();
      pattern8(n);
    }

}
