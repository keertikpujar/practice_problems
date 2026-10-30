// Problem: 294. Reverse a String I
// Link: https://takeuforward.org/practice/dsa/reverse-a-string-i?tab=code

class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        helper(s,0,s.size()-1);
        return s;
    
    }
    public void helper(ArrayList<Character> s,int left,int right){

        if(left>=right) return ;
        
            char temp=s.get(left);
            s.set(left,s.get(right));
            s.set(right,temp);

            helper (s,++left,--right);
        
    }
}
