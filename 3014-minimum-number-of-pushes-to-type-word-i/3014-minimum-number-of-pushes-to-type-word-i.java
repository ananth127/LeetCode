class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int sum=0;
        int i=1;
        System.out.println(n);
        if(n<=8){
            return n;
        }
        else if(n>8){
                i=n/8;
                while(i>0){
                    sum+=i*8;
                    System.out.println(sum);
                    i--;
                }
                 
            }
            return (sum+((n%8)*2));
        
    }
    }
