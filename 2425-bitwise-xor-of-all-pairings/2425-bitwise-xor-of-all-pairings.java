class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int total=0;
        for(int i=0;i<nums2.length;i++){
        total=total^nums2[i];
        }
        int tr=0;
        for(int i=0;i<nums1.length;i++){
           
                tr=tr^nums1[i];
            
        }
        if(nums2.length%2==0){
            tr=0;
        }
        if(nums1.length%2==0){
            total=0;
        }
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            ans=ans^total;
        }
        return ans^tr;
    }
}