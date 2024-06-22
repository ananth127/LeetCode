class Solution {
    public String removeOuterParentheses(String s) {
        String a="";
        int count=0;
        char next='(';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && count==0){
                count++;
            }
            else if(s.charAt(i)=='('){
                a+="(";
                count++;
            }
            else if(s.charAt(i)==')' ){
                count--;
                if(count==0){
                    continue;
                }
                else{
                a+=")";
                }
                
            }
        }
        return a;
    }
}