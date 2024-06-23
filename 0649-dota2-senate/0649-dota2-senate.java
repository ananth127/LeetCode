class Solution {
    public String predictPartyVictory(String s) {
        ArrayList<Character> q=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            q.add(s.charAt(i));
        }
        for(int i=0;i<q.size();){
            if(q.get(i)=='D'){
               int j=q.indexOf('R');
               if(j>=0){
                q.remove(j);
                q.add(q.get(i));
                q.remove(i);
               }
               else{
                return "Dire";
               }
            }
          else{
            int k=q.indexOf('D');
            if(k>=0){
                q.remove(k);
                q.add(q.get(i));
                q.remove(i);
            }
            else{
                return "Radiant";
            }
    }

}
return "";
}
}