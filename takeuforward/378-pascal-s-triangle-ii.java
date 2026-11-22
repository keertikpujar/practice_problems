// Problem: 378. Pascal's Triangle II
// Link: https://takeuforward.org/practice/dsa/pascals-triangle-ii?tab=code

import java.util.Collections;
class Solution {
    public int[] pascalTriangleII(int r) {
        int k=0;
        int[] ans=new int[r];
       for(int i=1;i<r+1;i++){
         ans[k++]=funcNCR(r,i);
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
