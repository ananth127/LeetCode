class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> li=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(li.containsKey(arr[i])){
                li.put(arr[i],li.get(arr[i])+1);
            }
            else{
                li.put(arr[i],1);
            }
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(li.get(arr[i])==1){c++;
            if(c==k) return arr[i];}
        }
      
        return "";
    }
}