// Problem: 929. Pattern 15
// Link: https://takeuforward.org/practice/dsa/pattern-15

class Solution {
    public void pattern15(int n) {
      for(int i=0;i<n;i++){
        char a='A';
        for (int j=0;j<=n-i-1;j++){
            System.out.print(a);
            a+=1;
        }
        System.out.println();
      }

    }
    
    
}
