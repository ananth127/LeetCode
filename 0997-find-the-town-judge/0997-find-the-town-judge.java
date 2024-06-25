class Solution {
    public int findJudge(int n, int[][] trust) {
        int ind[]=new int[n+1];
        int out[]=new int[n+1];
        
        for(int i=0;i<trust.length;i++){
            ind[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        for(int i=0;i<n+1;i++){
            if(ind[i]==n-1 && out[i]==0){
                return i;
            }
        }
        return -1;
    }
}