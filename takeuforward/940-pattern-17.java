// Problem: 940. Pattern 17
// Link: https://takeuforward.org/practice/dsa/pattern-17

class Solution {
    public void pattern17(int n) {
        
        for(int i=0;i<n;i++){
        
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }   
            char a='A';
            int breakpoint=(2*i+1)/2;
            for(int k=0;k<2*i+1;k++){   
                System.out.print(a);
                if(k<breakpoint) 
                  a++;
                else 
                  a--;
            }
            
             System.out.println();
        }
        }

    }

