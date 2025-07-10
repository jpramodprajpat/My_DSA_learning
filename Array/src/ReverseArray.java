import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 ,40 , 50 , 60 , 70};
        int n = arr.length;

        // Two Pointer concept
        int lo = 0 , hi = n-1;
        while(lo<=hi){
           int temp = arr[lo];
           arr[lo] = arr[hi];
           arr[hi] = temp;
           lo++;
           hi--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
