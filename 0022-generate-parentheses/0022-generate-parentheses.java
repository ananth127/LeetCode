class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a=new ArrayList<>();
        help(a,"",n,n);
        return a;
    }
    public ArrayList<String> help(ArrayList<String> a,String b,int open,int close){
        if(open ==0 && close ==0){
            a.add(b);
            return a;
        }
        if(open >0){
            help(a,b+"(",open-1,close);
        }
        
        if(close >0 && close>open){
            help(a,b+")",open,close-1);
        }
        return a;
    }
}