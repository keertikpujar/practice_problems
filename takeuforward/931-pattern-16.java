// Problem: 931. Pattern 16
// Link: https://takeuforward.org/practice/dsa/pattern-16

class Solution {
    public void pattern16(int n) {
        char a='A';
         for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a);
            }
            a+=1;
            System.out.println();
        }

    }
}
