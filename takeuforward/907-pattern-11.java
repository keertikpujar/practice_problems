// Problem: 907. Pattern 11
// Link: https://takeuforward.org/practice/dsa/pattern-11

import java.util.Scanner;
class Solution {
    public void pattern11(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }

    public void main(String...args){
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       pattern11(n);
    }
}
