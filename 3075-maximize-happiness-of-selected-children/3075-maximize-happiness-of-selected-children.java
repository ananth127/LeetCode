class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        long count=0;
        int n=happiness.length;
        for(int i=n-1;i>=n-k;i--)
        {
            ans=ans+Math.max(happiness[i]-count,0);
            count++;
        }
        return ans;
        
    }
}