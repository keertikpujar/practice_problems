// Problem: 790. Count of Prime Numbers till N
// Link: https://takeuforward.org/practice/dsa/count-of-prime-numbers-till-n

class Solution {
    public int primeUptoN(int n) {
       int count =0;
       for(int num=2;num<=n;num++){
        if(isPrime(num))   count++;
        }
        return count;
    }
    
    private boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }

}
