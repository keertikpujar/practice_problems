// Problem: 920. Pattern 14
// Link: https://takeuforward.org/practice/dsa/pattern-14

import java.util.Scanner;
class Solution {
    public void pattern14(int n) {
        for(int i=0;i<n;i++){
            char a='A';
            for(int j=0;j<i+1;j++){
                System.out.print(a);
                a+=1;
            }
            System.out.println();
            
        }
    }
    public void main(String...args){
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       pattern14(n);
    }
}
