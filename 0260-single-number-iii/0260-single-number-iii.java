class Solution {
    public int[] singleNumber(int[] nums) {
        // int count=0;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //         count--;
        //     }
        //     else{
        //         count++;
        //         map.put(nums[i],1);
        //     }
        // }
        // int arr[]=new int[count];
        // int k=0;
        // for(int i:map.keySet()){
        //     if(map.get(i)==1){
        //         arr[k++]=i;
        //     }
        // }
        // return arr;/
        int left=0;
        int right=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=nums[i]^ans;
        }
        int a=1;
        int count=0;
        while((ans & 1)!=1){
            count++;
            ans=ans>>1;
        }
        int first_group=0;
        int second_group=0;
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>count)& 1)==0){
                first_group^=nums[i];
            }
            else{
                second_group^=nums[i];
            }
        }
        int num[]=new int[2];
        num[0]=first_group;
        num[1]=second_group;
        return num;


    }
}