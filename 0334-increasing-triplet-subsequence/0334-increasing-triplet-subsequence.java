class Solution {
    public boolean increasingTriplet(int[] nums) {

        if(nums.length<3)

            return false;

    int max = Integer.MAX_VALUE;
    
    int max2 = Integer.MAX_VALUE;

    for(int num : nums){
        
        if(num<=max){
            max = num;
        }
        else if(num<=max2){
            max2 = num;    
        }
        else{
            return true;
        }
    }
        return false;
    
    }
}