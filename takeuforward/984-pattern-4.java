// Problem: 984. Pattern 4
// Link: https://takeuforward.org/practice/dsa/pattern-4

import java.util.Scanner;
class Solution {
    public void pattern4(int n) {
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }


    }

    public void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern4(n);
    }
}
