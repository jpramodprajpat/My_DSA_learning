package hashMap;
import java.util.HashMap;
public class Nice_Pairs {
    public int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int countNicePairs(int[] arr) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = arr[i] - reverse(arr[i]);
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                count += freq; // Important
                count = count % 1000000007;
                map.put(ele, freq + 1);
            } else map.put(ele, 1);
        }
        return count;
    }
}