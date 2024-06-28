class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int val=nums[1];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                // if(((val-nums[i])==diff) && (val==nums[j]) && ( nums[j]>nums[i])){
                //     count++;

                // }
                for(int k=j;k<nums.length;k++){
                    if((nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}