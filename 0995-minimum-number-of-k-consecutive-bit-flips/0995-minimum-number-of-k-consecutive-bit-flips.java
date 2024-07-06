class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int[] flip = new int[n];
        int flipped = 0;
        
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipped ^= flip[i - k];
            }
            if (nums[i] == flipped) {
                if (i + k > n) {
                    return -1;
                }
                count++;
                flipped ^= 1;
                flip[i] = 1;
            }
        }
        return count;
    }
}
