package hashMap;
import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int arr[] , int target){
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            }else map.put(arr[i],i);

        }
        return ans;
    }
}
