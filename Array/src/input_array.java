import java.util.Scanner;
public class input_array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length; //we don't want to find arry length again and again

        // take the input array
        for (int i = 0; i < n; i++) {
            System.out.print("enter value of "+i+"th element : "  );
            arr[i] = sc.nextInt();
        }

        // printing the array
        System.out.println("Your Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
