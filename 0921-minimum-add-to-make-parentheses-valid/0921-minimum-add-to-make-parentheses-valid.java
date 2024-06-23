class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        char next='(';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' &&  next=='('){
                count++;
                next=')';
            }
            else if(s.charAt(i)=='(' &&  next==')'){
                count++;
                next=')';
            }
            else if(s.charAt(i)==')' && next==')'){
                count--;
                next='(';
            }
            else{
                count--;
            }
        }
        return Math.abs(count);
    }
}