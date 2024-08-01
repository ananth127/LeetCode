class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String n=details[i].substring(11,13);
            if(Integer.valueOf(n)>60){
                count++;
            }
        }
    return count;
    }
}