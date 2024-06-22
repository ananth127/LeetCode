class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(Integer a:freq.values()){
            max=max<a?a:max;
        }
        for(Integer a:freq.values()){
            count=(max==a)?(count+max):(count+0);
        }
        return count;
    }
}