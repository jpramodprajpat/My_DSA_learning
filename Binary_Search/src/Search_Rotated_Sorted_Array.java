public class Search_Rotated_Sorted_Array {
    // Method -1 : not good approuch
    public  static int bs(int[] arr , int lo , int hi , int target){
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int n = arr.length;

        // Handle very small array
        if(n <= 2){
            for(int i = 0; i < n; i++){
                if(arr[i] == target) return i;
            }
            return -1;
        }

        int lo = 0, hi = n - 1;
        int pivot = -1;

        // Find the pivot (index of largest element before rotation)
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(mid < n - 1 && arr[mid] > arr[mid + 1]){
                pivot = mid;
                break;
            }
            if(mid > 0 && arr[mid] < arr[mid - 1]){
                pivot = mid - 1;
                break;
            }

            if(arr[mid] >= arr[lo]){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        // If pivot not found, array is not rotated
        if(pivot == -1){
            return bs(arr, 0, n - 1, target);
        }

        // Try both parts
        int left = bs(arr, 0, pivot, target);
        if(left != -1) return left;

        return bs(arr, pivot + 1, n - 1, target);
    }

    // Methode -2 : good approuch
    public static int SearchRotated(int[] arr, int target){
        int n = arr.length;
        // smallest element
        int lo = 0, hi = n-1;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[hi]) lo = mid + 1;
            else hi = mid;
        }
        // check target element is in which part
        int pivot = lo; lo = 0; hi = n-1;
        if(target>=arr[pivot] && target<=arr[hi]) lo = pivot; // right sorted part
        else hi = pivot - 1; // left sorted part

        // Standard Binary Search
       return bs(arr,lo,hi,target);

    }

    //  methode - 3 : Sir ki approuch
    public static int SearchInRotated(int[] arr, int target)
    {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi)
        {
            int mid = lo + (hi - lo )/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] <= arr[hi])
            { // check target in right sorted array
                if(target>arr[mid] && target<=arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }else
            { // check target in left sorted array
                if(target>=arr[lo] &&  target<arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,8,1,2,3};
        int n = arr.length;
        int target = 2;
        if(SearchInRotated(arr,target)!= -1)
        System.out.println(arr[SearchInRotated(arr,target)]);
        else System.out.println("not found");
    }
}
