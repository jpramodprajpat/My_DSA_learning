package Tony_Stark.level_01;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,9,11,12};
        int n = arr.length;
        int target = 2;
        boolean flag = false;
        int lo =  0  , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }else if(arr[mid] > target) hi = mid-1;
            else lo = mid + 1;
        }
        if(flag) System.out.println("target found");
        else System.out.println("target is not present");

    }
}
