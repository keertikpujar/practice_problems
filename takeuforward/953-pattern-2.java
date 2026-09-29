// Problem: 953. Pattern 2
// Link: https://takeuforward.org/practice/dsa/pattern-2

import java.util.Scanner;
class Solution {
    public void pattern2(int n) {
        for (int i = 0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern2(n);
    }
}
