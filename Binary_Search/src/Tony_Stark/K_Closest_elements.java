package Tony_Stark;
import java.util.*;
public class K_Closest_elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        if(x<arr[0]){
            for(int i = 0; i<k; i++) ans.add(arr[i]);
            return ans;
        }
        if(x>arr[n-1]){
            for(int i = n-k;i<n; i++) ans.add(arr[i]);
            return ans;
        }

        //1. lower bound
        int lo = 0 , hi = n-1  , lb = -1;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >= x){
                lb = mid;
                hi = mid-1;
            } else lo = mid+1;
        }

        //2. two pointer
        int i = lb-1,j = lb;
        while(k>0 && i>=0 && j<n) {
            int  di = Math.abs(arr[i]-x);
            int  dj = Math.abs(arr[j]-x);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while (k > 0 && i >= 0) {
            ans.add(arr[i--]);
            k--;
        }
        while (k > 0 && j < n) {
            ans.add(arr[j++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        int n = arr.length;
        int lo = 0 , hi = n-k;
        while(lo<hi)
        {
            int mid = lo + (hi-lo)/2;
            if(x - arr[mid] > arr[mid+k] -x) lo = mid + 1; // right side better
            else hi = mid; // left side better
        }
        List<Integer> result = new ArrayList<>();
        for (int i = lo; i < lo + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
