import java.util.Scanner;
public class Ulta_triangle_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();
        //m-1
       /* for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
             //   if(i+j >n) System.out.print("* ");
                if(j>=n+1-i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }*/

        //m-2
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
             //   System.out.print("* ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
//triangle

    }
}
