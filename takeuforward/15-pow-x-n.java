// Problem: 15. Pow(x,n)
// Link: https://takeuforward.org/practice/dsa/pow(x%2Cn)

class Solution {
    public double myPow(double x, int n) {
         long binForm = n;
        if (binForm < 0) {
            x = 1 / x;
            binForm = -binForm;
        }
        
        double ans = 1.0;
        double currentProduct = x;
        
        while (binForm > 0) {
            // If binForm is odd
            if (binForm % 2 == 1) {
                ans = ans * currentProduct;
            }
            // Square the base and halve the exponent
            currentProduct = currentProduct * currentProduct;
            binForm = binForm / 2;
        }
    }
}
