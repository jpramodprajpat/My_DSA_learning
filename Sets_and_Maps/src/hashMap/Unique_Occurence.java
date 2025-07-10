package hashMap;
import java.util.HashMap;
import java.util.HashSet;
public class Unique_Occurence
{
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i<arr.length ; i++)
        {
            int key = arr[i];
            if(map.containsKey(key))
            {
                // get it's freq
                int freq = map.get(key);
                map.put(key,freq+1);
            }else map.put(key,1);
        }
        // we have frequency now we have compare the frequencies
        HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values()){
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
        return true;
    }

}
