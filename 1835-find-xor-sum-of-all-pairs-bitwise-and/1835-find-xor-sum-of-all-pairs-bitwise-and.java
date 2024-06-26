class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int a=0;
        for(int i=0;i<arr1.length;i++){
            a=a^arr1[i];
        }
        int b=0;
        for(int i=0;i<arr2.length;i++){
            b=b^arr2[i];
        }
        return a&b;
    }
}