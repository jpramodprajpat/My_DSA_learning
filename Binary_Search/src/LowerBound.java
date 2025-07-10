import java.util.Scanner;
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,30,40,50,50,60,70};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = arr.length;

        int lb = n-1;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >= target){
                lb = Math.min(lb,mid); // potenial answer
                hi = mid -1; // check further left
            }else lo = mid+1;
        }
        System.out.println(lb);
    }
}
