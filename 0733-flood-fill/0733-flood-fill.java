class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        if(val==color)
            return image;
        else
            return helper(image,sr,sc,color,val);
    }
    public int[][] helper(int arr[][],int sr,int sc,int color,int val){
        if((sc<0 || sr<0) || (sc>=arr.length || sr>=arr[0].length || arr[sr][sc]!=val)){
            
            return arr;
        }
        arr[sr][sc]=color;
           
                helper(arr,sr-1,sc,color,val);
           
                helper(arr,sr+1,sc,color,val);
            
                helper(arr,sr,sc+1,color,val);
                helper(arr,sr,sc-1,color,val);
                return arr;
            }
        
        
    
}