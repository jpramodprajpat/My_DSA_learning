package hashMap;
import java.util.HashMap;
public class Valid_Anagram {
    public static void main(String[] args) {
        String s ="anagram" , t ="nagaram";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> smap = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
           char key = s.charAt(i);
           if(smap.containsKey(key)) // if present in map
           {
               int freq = smap.get(key);
               smap.put(key,freq+1);
           }else smap.put(key,1); // not present -> add new map
        }
        HashMap<Character,Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
           char key = s.charAt(i);
           if(tmap.containsKey(key)) // if present in map
           {
               int freq = tmap.get(key);
               tmap.put(key,freq+1);
           }else tmap.put(key,1); // not present -> add new map
        }

        for(char key : smap.keySet()){
            int val1 = smap.get(key);
            if(!tmap.containsKey(key)) return false;
            int val2 = tmap.get(key);
            if(val1 != val2) return false;
        }
      return true;
    }
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);

            char ch2 = t.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }

        if (map1.equals(map2)) return true;
        else return false;

    }
}
