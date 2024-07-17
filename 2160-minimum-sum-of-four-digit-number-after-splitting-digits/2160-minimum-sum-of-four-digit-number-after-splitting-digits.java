class Solution {
    public int minimumSum(int num) {
        int temp=num;
        int arr[]=new int[4];
        int i=0;
        while(temp>0){
            arr[i]=temp%10;
            temp=temp/10;
           // System.out.print(arr[i]+" ");
            i++;
        }

        Arrays.sort(arr);
        return (((arr[0]*10)+arr[2])+((arr[1]*10)+arr[3]));
    }
}