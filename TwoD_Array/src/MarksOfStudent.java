import java.util.Scanner;
public class MarksOfStudent {
    // 4 students -> each student marks and roll no.
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        Scanner sc = new Scanner(System.in);

        // input marks and roll no.
        for (int i = 0; i <4 ; i++) {
            System.out.println("student "+(i+1) +" roll no and marks: ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //display marks and roll no.
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
