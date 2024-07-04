class Solution {
    public boolean judgeCircle(String s) {
        int ud=0;
        int lr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                ud++;
            }
            else if(s.charAt(i)=='D' ){
                ud--;
            }
            else if(s.charAt(i)=='L' ){
                lr++;
            }
            else if(s.charAt(i)=='R' ){
                lr--;
            }

        }
        if(ud==0 && lr==0){
            return true;
        }
        else{
            return false;
        }
    }
}