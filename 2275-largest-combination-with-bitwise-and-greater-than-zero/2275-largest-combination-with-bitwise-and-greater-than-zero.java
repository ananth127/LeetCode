class Solution {
    public int largestCombination(int[] candidates) {
        int a=candidates[0];
        int count=1;
        int max=candidates[0]&candidates[1];
        for(int i=1;i<candidates.length;i++){
            int b=a&candidates[i];
            if(((a&candidates[i])>0) && (b>=max)){
                max=b;
                a=candidates[i];
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}