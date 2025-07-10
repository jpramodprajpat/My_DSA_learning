import java.util.Arrays;
public class Q3_RotateArray
{
    public static void rotateLeft(int[] arr , int k){
        int n = arr.length;
        k = k%n;

        reverse(arr,0,k-1); //step -1 reverse o -> k-1
        reverse(arr,k,n-1);//step -2   reverse k -> n-1
        reverse(arr,0,n-1); //step-3 : reverse complete array
    }
    public static void reverse(int[] arr , int lo , int hi){
       while(lo<hi){
           int temp = arr[lo];
           arr[lo] = arr[hi];
           arr[hi] = temp;
           lo++; hi--;
       }
    }
    public static void main( String args[] )
    {
        int[] arr = { 2 ,3 , 5 , 7 , 11 , 13 , 17 };
        int n = arr.length;
        int k = 5;

        rotateLeft(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}

