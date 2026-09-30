// Problem: 1008. Pattern 9
// Link: https://takeuforward.org/practice/dsa/pattern-9

import java.util.Scanner;
class Solution {

    public void pattern9(int n) {
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        

    }

    public  void main(String...args){
        Scanner scan =new Scanner(System.in);
        int n =scan.nextInt();
        pattern9(n);
    }
}
