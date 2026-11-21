// Problem: 161. Pascal's Triangle I
// Link: https://takeuforward.org/practice/dsa/pascals-triangle-i

class Solution {
    public int pascalTriangleI(int r, int c) {
         return funNCR(r-1,c-1);
    }
    static int funNCR(int r,int c){
         int res=1;
         for(int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
         }
         return res;
    }
}
