class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==1){
            return 1;
        }
        for(int i=1;i<nums.length+1;i++){
            if( i<nums.length && nums[i]==i ){
                System.out.println("continue");
                continue;
            }
            else{
                System.out.println("return");
                return i;
            }
        }
        System.out.println("Last");
        return nums[nums.length-1];
    }
}