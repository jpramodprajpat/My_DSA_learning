import java.util.*;

public class _01_basic {
    public static void main(String[] args) {
        HashSet<Integer>  set = new HashSet<>();
        set.add(10);
        set.add(-7);
        set.add(100);
        set.add(20);
        System.out.println(set);

        // search => TC = O(1)
        System.out.println(set.contains(20));
        System.out.println(set.contains(020));
        System.out.println(set.contains(15));

        // remove => TC = O(1)
        set.remove(20);
        System.out.println(set.size());
    }
    public int maxOperations(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[0]; // take array element
            if(map.containsKey(ele)){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }else map.put(ele,1);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            int freq = map.get(key);
            if(map.containsKey(rem)){
                count++;
                int remFreq = map.get(rem);
                if(rem == 1) map.remove(rem);
                else map.put(rem,remFreq-1);
                if(freq == 1) map.remove(key);
                else map.put(key,freq-1);

            }
        }
        return count;
    }
}
