class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int ans=0;
        for(int i=0;i<colors.length()-1;i++){
            ans=0;
            if(colors.charAt(i)==colors.charAt(i+1)){ 
                if(neededTime[i]>neededTime[i+1]){
                    sum+=neededTime[i+1];
                    neededTime[i+1]=neededTime[i];
                }
                else {
                    sum+=neededTime[i];
                }
            }
        }

        return sum;
    }
}