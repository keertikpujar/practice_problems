// Problem: 248. Move Zeros to End
// Link: https://takeuforward.org/practice/dsa/move-zeros-to-end

class Solution {
    public void moveZeroes(int[] a) {
        int j = -1;
        
        // Find the position of the first zero
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        
        // If no zero is found, return
        if (j == -1) return;
        
        // Move non-zero elements forward and swap with zeros
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
}
