// Problem: 909. Pattern 12
// Link: https://takeuforward.org/practice/dsa/pattern-12

import java.util.Scanner;
class Solution {
    
    public void pattern12(int n) {
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            
            }
             
            
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }

    }

    public void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();  
        pattern12(n);
    }
}
