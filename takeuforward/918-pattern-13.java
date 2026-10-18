// Problem: 918. Pattern 13
// Link: https://takeuforward.org/practice/dsa/pattern-13

import java.util.Scanner;
class Solution {
    public void pattern13(int n) {
        int num=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(num+" " );
                num+=1;
            }
            System.out.println();

        }

    }
    public void main(String...args){
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      pattern13(n);
    }
}
