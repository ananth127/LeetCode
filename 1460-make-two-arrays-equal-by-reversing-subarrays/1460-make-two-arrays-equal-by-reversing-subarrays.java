class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean ans=true;
        for(int i=0;i<arr.length-1;i++){
            int key=target[i];
            int j=i;
            //System.out.println(arr[i]+" ");
            for(;j<arr.length;j++){
                System.out.println(arr[j]+" :break");
                if(j>=arr.length || arr[j]==key) break;
            }
            //System.out.println(i+" ij "+j);
            for(int k=i;k<j && j<arr.length;k++){
               // System.out.println(k+" kj "+j+" "+arr.length);
                if(k>=arr.length ) break;
                if(k>j){break;}
                // System.out.println("akf");
                // System.out.println(arr[k]+" 1: "+arr[j]);
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
               // System.out.println(arr[k]+" 2: "+arr[j]);

                j--;
            }
            //System.out.println(arr[i]+" val ");
            if(key!=arr[i]){
                return false;
            }
        }
        if(arr[arr.length-1]!=target[target.length-1]){
            return false;
        }
        return true;
    }

}