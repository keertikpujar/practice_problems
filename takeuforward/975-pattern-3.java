// Problem: 975. Pattern 3
// Link: https://takeuforward.org/practice/dsa/pattern-3

import java.util.Scanner;
class Solution {
    public void pattern3(int n) {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }

    }

    public void main(String args[])
    {
          Scanner scan =new Scanner(System.in);
          int n = scan.nextInt();
          pattern3(n);
    }
}
