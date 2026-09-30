// Problem: 898. Pattern 10
// Link: https://takeuforward.org/practice/dsa/pattern-10

import java.util.Scanner;
class Solution {
    public void pattern10(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void main(String...args){
         Scanner scan=new Scanner(System.in);
         int n = scan.nextInt();
         pattern10(n);
    }
}
