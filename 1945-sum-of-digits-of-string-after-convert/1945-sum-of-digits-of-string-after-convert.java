class Solution {
    public int getLucky(String s, int k) {
        String a="";
       for(int i=0;i<s.length();i++){
            a+=((s.charAt(i)+0)-96)+"";
       }
       int b=a.length()-1;
       int sum=0;
       while(k>0 && b>=0){
            sum+=(Integer.parseInt(a.charAt(b)+""));
            b--;
            if(b==-1 && k!=1){
                a=Integer.toString(sum);
                b=a.length()-1;
                sum=0;
                k--;
            }
       }
       return sum;

    }
}