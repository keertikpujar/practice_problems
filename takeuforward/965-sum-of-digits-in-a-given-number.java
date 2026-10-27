// Problem: 965. Sum of Digits in a Given Number
// Link: https://takeuforward.org/practice/dsa/sum-of-digits-in-a-given-number?tab=code

class Solution {
    public int addDigits(int num) {
        int lastdigit=0;
        if(num==0) return 0;
        if (num>0){
           lastdigit=num%10;
           num = num/10;
        }
        int  sum=lastdigit+addDigits(num);

        while(sum>=10){
            sum=addDigits(sum);
        }
        return sum;
    }  
}
