// Problem: 70. Rotate matrix by 90 degrees
// Link: https://takeuforward.org/practice/dsa/rotate-matrix-by-90-degrees?tab=code

class Solution {
    public int[][] rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
        int left=0;
        int right=n-1;
        while(left<right){
           int temp=matrix[i][left];
           matrix[i][left]=matrix[i][right];
           matrix[i][right]=temp;
           left++;
           right--;
        }
        }
        return matrix;
    }
}
