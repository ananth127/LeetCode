class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                continue;
            }
            count++;
            t=t^1;


        }
        return count;
        
    }
}