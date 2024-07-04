class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int r[]=new int [nums.length];
        int l[]=new int [nums.length];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            l[i]=sum;
        }
        sum=0;
        for(int j=n-1;j>=0;j--){
            sum+=nums[j];
            r[j]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.println(r[i]+" "+(n-i)+" "+nums[i]);
            int ri=r[i]-Math.abs((n-i)*(nums[i]));
            int le=l[i]-Math.abs((i+1)*(nums[i]));
            nums[i]=ri-le;
        }
        return nums;
    }
}