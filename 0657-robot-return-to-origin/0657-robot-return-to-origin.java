class Solution {
    public boolean judgeCircle(String s) {
        int ud=0;
        char nud='U';
        char nlr='L';
        int lr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U' && (nud=='U')){
                ud++;
                nud='U';
            }
            else if(s.charAt(i)=='D' && nud=='U'){
                ud--;
            }
            else if(s.charAt(i)=='L' && (nlr=='L')){
                lr++;
                nlr='L';
            }
            else if(s.charAt(i)=='R' && nlr=='L'){
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