// Problem: 997. Pattern 7
// Link: https://takeuforward.org/practice/dsa/pattern-7

class Solution {
    public void pattern7(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
