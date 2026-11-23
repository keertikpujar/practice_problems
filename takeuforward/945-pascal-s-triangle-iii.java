// Problem: 945. Pascal's Triangle III
// Link: https://takeuforward.org/practice/dsa/pascals-triangle-iii

import java.util.Collections;
class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
          ArrayList ans=new ArrayList<>();
          for(int i=1;i<n+1;i++){
            ArrayList temp=new ArrayList<>();
            for(int j=1;j<=i;j++){
                temp.add(funcNCR(i,j));
            }
            ans.add(temp);
          }
          return ans;
    }
    static int funcNCR(int r,int c){
        int res=1;
        for(int i=1;i<c;i++){
            res=res*(r-i);
            res=res/i;
        }
        return res;
    }
}
