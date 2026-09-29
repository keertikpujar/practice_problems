// Problem: 986. Pattern 5
// Link: https://takeuforward.org/practice/dsa/pattern-5

import java.util.Scanner;
class Solution {
    public void pattern5(int n) {
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern5(n);
    }
}
