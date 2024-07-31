class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int N = books.length;
        int [] dp = new int [N + 1];

        dp[N] = 0;

        for (int i = N-1; i >= 0; i--) {
            int avail_width = shelfWidth;
            int max_height = 0;
            dp[i] = Integer.MAX_VALUE;

            for (int j=i; j < N; j++) { 
                int width = books[j][0];
                int height = books[j][1];
                if (avail_width < width) {
                    break;
                }
                avail_width -= width;
                max_height = Math.max(max_height, height);
                dp[i] = Math.min(dp[i], dp[j+1] + max_height);
            }
        }
        return dp[0];
    }
}