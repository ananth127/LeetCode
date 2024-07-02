class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(arr.containsKey(nums1[i])){
                arr.put(nums1[i],arr.get(nums1[i])+1);
            }
            else{
                arr.put(nums1[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(arr.containsKey(nums2[i]) && arr.get(nums2[i])>0){
                arr.put(nums2[i],arr.get(nums2[i])-1);
                list.add(nums2[i]);
            }
        }
        int ar[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ar[i]=list.get(i);
        }
        return ar;
    }
}
