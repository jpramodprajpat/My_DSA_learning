package hashMap;
import java.util.HashMap;
public class ArrayPairs_divisible_By_K {
    public boolean canArrange(int[] arr, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            int key = arr[i] % k ;
            if(key<0)   key = key + k;
            if(map.containsKey(key)) {
                int freq = map.get(key); // to handle negative numbers
                map.put(key, freq+1);
            }else map.put(key,1);
        }
        // check before answer
        if(map.containsKey(0)){
            if(map.get(0) %2 != 0) return false;
            map.remove(0);
        }
        //one more check
        if(k%2 == 0 && map.containsKey(k/2)){
            if(map.get(k/2) %2 != 0) return false;
            map.remove(k/2);
        }
        for(int key : map.keySet()){
            if(key<0){

            }
            int rem = k - key;
            if(!map.containsKey(rem))  return false;
            int freq = map.get(key);
            int remfreq = map.get(rem);
            if(freq != remfreq) return false;
        }
        return true;
    }
}
