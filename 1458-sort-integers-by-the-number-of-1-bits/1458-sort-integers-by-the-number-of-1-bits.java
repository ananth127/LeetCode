class Solution {

    static int helper(int n){
        int ans = 0;
        while(n>0){
            if(n%2!=0) ans++;
            n = n/2;
        }
        return ans;
    }

    static class Bits{
        int num;
        int bits;
        Bits(int num, int bits){
            this.num = num;
            this.bits = bits;
        }
    }

    public static class BitsComparator implements Comparator<Bits>{
        public int compare(Bits a, Bits b){
            if(a.bits-b.bits==0) return a.num-b.num;
            else return a.bits-b.bits;
        }
    }

    public int[] sortByBits(int[] arr) {

        
        int n = arr.length;
        Bits ans[] =  new Bits[n];

        for(int i=0; i<n; i++){
            ans[i] = new Bits(arr[i],helper(arr[i]));
        }

        Arrays.sort(ans,new BitsComparator());
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = ans[i].num;
        }
        
        return a;
            
    }
}