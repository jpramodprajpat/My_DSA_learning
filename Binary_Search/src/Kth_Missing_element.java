public class Kth_Missing_element {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            int missed = arr[mid] - (mid+1);
            if(missed < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return k+lo;
    }

    public static void main(String[] args) {
       int[] arr = {2,3,4,7,11};
       int k = 3;
        System.out.println(findKthPositive(arr,k));
    }
}
