public class Peak_Index_MountainArray {
    public static void main(String[] args) {
        int[]  arr = {2,4,8,1};
        int n = arr.length; // n : mininmin length - 3
        int lo = 1 ,hi = n-2;
        int peak = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                peak = mid ; break;
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid+1;
            else hi = mid - 1;
        }
        System.out.println(arr[peak]);
    }
}
