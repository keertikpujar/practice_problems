// Problem: 932. Sum of First N Numbers
// Link: https://takeuforward.org/practice/dsa/sum-of-first-n-numbers

class Solution {
    int sum=0;
    public int NnumbersSum(int N) {
        if(N>0){
         sum=NnumbersSum(N-1)+N;
        }
        return sum;
    }
}
