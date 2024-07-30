class Solution {
    public int singleNonDuplicate(int[] nums) {
       
       Map<Integer,Integer> li=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(li.containsKey(nums[i])){
            li.remove(nums[i]);
        }
        else{
            li.put(nums[i],1);
        }
       }
       Integer result = li.keySet().iterator().next();
        return result;
    }
}