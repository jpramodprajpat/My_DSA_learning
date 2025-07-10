package hashMap;

import java.util.HashMap;

public class Longest_subString_NoRepetition {
    public int lengthOfLongestSubstring(String s)  {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();

        int i = 0, j = 0;
        int maxlen = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >= i){ //exits and idx lies b/w i&j
                int len = j-i;
                maxlen = Math.max(len,maxlen);
                while(s.charAt(i) != ch) i++;
                i++;
            }
            map.put(ch,j);
            j++;

        }
        maxlen = Math.max(maxlen, j - i);
        return maxlen;
    }
}
