public class First_Last_postion_occurence {
    // not good solution -> tc : O(N) in worst case -> my solution
    public int[] searchRange1(int[] arr, int target) {

        int n = arr.length;
        boolean flag = false;
        int[] res = {-1,-1};
        int lo = 0 , hi = n-1;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target)
            {
                flag = true;
                int i = mid, j = mid;

                while (i - 1 >= 0 && arr[i - 1] == target) i--;
                while (j + 1 < n && arr[j + 1] == target) j++;
                res[0] = i; res[1] =j;
                return res;
            }
            else if(arr[mid]>target) hi = mid -1 ;
            else lo = mid + 1;
        }
        return res;
    }

    // good solution -> tc : O(logn)
    public int[] searchRange2(int[] arr, int target) {
        int[] res = {-1,-1}; // default answer if trget not found
        res[0] = firstPosition(arr,target);
        res[1] = lastPosition(arr,target);
        return res;
    }
    private static int firstPosition(int[] arr , int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1 , ans = -1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >= target){
                hi = mid-1; //move left to find earlier occurence
            }else lo = mid + 1;

            if(arr[mid] == target) ans = mid; // record the match
        }
        return ans;
    }
    private static int lastPosition(int[] arr , int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1 , ans = -1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] <= target){
                lo = mid+1; // move right to find later occurence
            }else hi = mid-1;

            if(arr[mid] == target) ans = mid; // record the match
        }
        return ans;
    }

    // main
    public static void main(String[] args) {

    }

}
