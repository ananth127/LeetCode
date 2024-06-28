class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int ar[][]=new int[arr.length][2];
        for(int i=0;i<n;i++)
        {
             ar[i][0]=arr[i];
             ar[i][1]=Integer.bitCount(arr[i]);
        }
        Arrays.sort(ar,new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                int p=a[1];
                int q=b[1];
                if(p>q) return 1;
                else if(p<q) return -1;
            return 0 ;
            }
        });
        for(int i=0;i<n;i++)
         arr[i]=ar[i][0];
        return arr;
   }
}