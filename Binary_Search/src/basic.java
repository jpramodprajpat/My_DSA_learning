import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        int[] arr = {2,5,6,18,20,23,39,40};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean flag = false ; // not present

        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target)  {
                flag = true;
                break;
            }
           else if(arr[mid] > target) hi = mid-1;
           else if(arr[mid] < target) lo = mid+1;
        }

        if(flag) System.out.println("present");
        else System.out.println("not found");
    }
}
