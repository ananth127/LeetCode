class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum=0;
        ArrayList<Integer> tr=new ArrayList<>();
        for(int i=0;i<garbage.length;i++){
            int j=0;
            int count=0;
            while(j<garbage[i].length()){
                if(garbage[i].charAt(j)=='M'){
                    count++;
                }
                j++;
            }
            tr.add(count);
        }
        trimArrayList(tr, 0);
        
        for(int i=0;i<tr.size();i++){
            sum+=(tr.get(i));
            if(i>0){
                sum+=travel[i-1];
            }
        }
        tr.clear();
        for(int i=0;i<garbage.length;i++){
            int j=0;
            int count=0;
            while(j<garbage[i].length()){
                if(garbage[i].charAt(j)=='P'){
                    count++;
                }
                j++;
            }
            tr.add(count);
        }
        trimArrayList(tr, 0);
        
        for(int i=0;i<tr.size();i++){
            sum+=(tr.get(i));
            if(i>0){
                sum+=travel[i-1];
            }
        }
        tr.clear();
        for(int i=0;i<garbage.length;i++){
            int j=0;
            int count=0;
            while(j<garbage[i].length()){
                if(garbage[i].charAt(j)=='G'){
                    count++;
                }
                j++;
            }
            tr.add(count);
        }
        trimArrayList(tr, 0);
        
        for(int i=0;i<tr.size();i++){
            sum+=(tr.get(i));
            if(i>0){
                sum+=travel[i-1];
            }
        }
        
        return sum;
    }
    public static void trimArrayList(ArrayList<Integer> arrayList, int trimValue) {
        // Iterate from the end of the list
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            // Check if the element matches the trimValue
            if (arrayList.get(i) == trimValue) {
                // Remove the element
                arrayList.remove(i);
            } else {
                // Stop trimming if we encounter an element that doesn't match the trimValue
                break;
            }
        }
    }
}