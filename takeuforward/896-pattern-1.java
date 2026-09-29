// Problem: 896. Pattern 1
// Link: https://takeuforward.org/practice/dsa/pattern-1

import java.util.Scanner;
class Solution {
    public void pattern1(int n) {
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            
    }

    public  void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern1(n);
    }

}
