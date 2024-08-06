import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int minimumPushes(String word) {
        int ct[] = new int[26];
        for(char ch: word.toCharArray()){
            ct[ch-'a']++;
        }
        ct = Arrays.stream(ct).boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        int res = 0;
        for(int i=0; i<26; i++){
            int val = (i)/8;
            int curr = (val+1)*ct[i];
            res += curr;
        }
        return res;
    }
}
