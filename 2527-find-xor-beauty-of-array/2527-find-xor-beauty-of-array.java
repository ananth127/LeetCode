class Solution {
    public int xorBeauty(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            a^=nums[i];
        }
        return a;
    }
}