import java.util.Scanner;
public class Star_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();

        int nsp = n-1 , nst = 1;
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }
            if(i<n){
                nsp--; nst+=2;
            } else if(i>=n)
            { // till nsp = 0 and nst = max
                nsp++; nst = nst-2;
            }
            System.out.println();
        }
    }
}
