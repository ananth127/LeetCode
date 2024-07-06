class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Find the minimum element in each row
        int[] rowMinIndices = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }
            }
            rowMinIndices[i] = minIndex;
        }
        
        // Step 2: Check if the found minimum elements are the maximum in their respective columns
        for (int i = 0; i < matrix.length; i++) {
            int colIndex = rowMinIndices[i];
            int minValue = matrix[i][colIndex];
            boolean isLucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][colIndex] > minValue) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(minValue);
            }
        }
        
        return result;
    }

}