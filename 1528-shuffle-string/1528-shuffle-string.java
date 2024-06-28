class Solution {
    public String restoreString(String s, int[] indices) {
        String a="";
        char []n=new char[s.length()];
        for(int i=0;i<n.length;i++){
            // System.out.println(s.charAt(b)+" - "+b);
            // a+=s.charAt(b);
            n[indices[i]]=s.charAt(i);
        }
        for(char i:n){
            a+=i;
        }
        return a;
    }
}