class Solution {
    public int minSwaps(String s) {
        char arr[]=new char[s.length()];
        arr=s.toCharArray();
        // for(int i=0;i<)
        // for(int i=0;i<s.length();i++){
        //     if((!st.isEmpty())&& st.peek()=='['&& s.charAt(i)==']'){
        //         st.pop();
        //     }
        //     st.push(s.charAt(i));

        // }
        int count=0;
        int j=s.length()-1;
        int len=arr.length;
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='[' && arr[i+1]==']'){
                i++;
            }
            else if(arr[i]==']'){
                j=i;
                while(j<len){
                    if(arr[j]=='['){
                        ans=j;
                    }
                    j++;
                }
                char a=arr[i];
                arr[i]=arr[ans];
                arr[ans]=a;
                count++;
                len=ans;
                if(arr[i]=='[' && arr[i+1]==']'){
                i++;
            }
            }

        }

        return count;
    }
}