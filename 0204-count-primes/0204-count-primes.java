class Solution {
    public int countPrimes(int a) {
        
        int arr[]=new int[a];
        Arrays.fill(arr,1);
        int count=0;
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i<a;i++){
            if(arr[i]==1){
            for(int j=2*i;j<a;j=j+i) {

                arr[j] = 0;
            }
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}