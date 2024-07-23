class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ans.containsKey(nums[i])){
                ans.put(nums[i],ans.get(nums[i])+1);
            }
            else{
                ans.put(nums[i],1);
            }
        }
        for(Integer a:ans.key()){
            System.out.println(a+" "+a.get());
        }
        return new int[2];
    }
}