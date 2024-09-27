class Solution {
    public int maxProfit(int[] prices) {
    //     int max=prices[prices.length-1];
    //     int j=prices.length;
    //     int maxin=j-1;
    //     int min=prices[0];
    //     int minin=0;
    //     j-=2;
    //     System.out.print(j+" j");
    //     for(int i=1;i<prices.length-1;i++){
    //         if(i>j) break;
            
    //         if(min>prices[i]){
    //             min=prices[i];
    //             minin=i;
    //             System.out.print("min");
    //         }
    //         if(max<prices[j]){
    //             max=prices[j];
    //             maxin=j;
    //             System.out.print("mzd");
    //         }
    //         j--;
    //     }
    //     if(max-min>0)
    //     return max-min;
    //     else
    //     return 0;
    // }
     int min=Integer.MAX_VALUE;
    int max=0;
    for(int i=0;i<prices.length;i++)
    {
        min=Math.min(min,prices[i]);
        max=Math.max(max,prices[i]-min);
    }
    return max;
    }
}