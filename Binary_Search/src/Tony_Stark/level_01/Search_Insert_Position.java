package Tony_Stark.level_01;
public class Search_Insert_Position {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        // arr[idx]>= x
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]== target) return mid;
            else  if(arr[mid]<target) lo = mid+1;
            else hi = mid-1;
        }
        return lo;
    }
}
