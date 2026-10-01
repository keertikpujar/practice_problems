// Problem: 964. Pattern 21
// Link: https://takeuforward.org/practice/dsa/pattern-21

class Solution {
    public void pattern21(int n) {
        for (int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                if((i==0||i==n-1)||(j==0||j==n-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
                System.out.println();
        }
    }
}

