import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // input
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("enter arr["+i + ", " +j+"] : ");
//               arr[i][j] = sc.nextInt();
//            }
//        }

        // output of two dimensional array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3 ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        for (int[] ele : arr){
            for (int val : ele){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
