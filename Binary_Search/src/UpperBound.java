import java.util.Scanner;
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,30,40,50,50,60,70};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = arr.length;

        int ub = n-1;
        int lo = 0  , hi = n-1;
        while(lo<=hi){
            int mid = (hi-lo)/2 + lo;
            if(arr[mid] > target){
                ub = Math.min(ub,mid); // potenital answer
                hi = mid - 1;
            }else lo = mid +1;
        }
        System.out.println(ub);
    }
}
