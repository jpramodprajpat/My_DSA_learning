import java.util.Arrays;

public class Matrix_Multipication {
    public static void main(String[] args) {
        int[][] a = {{3, 1, 2}, {4, 0, 5}}; //m=2 n=3
        int[][] b = {{2, 3}, {1, 0}, {4, 6}}; //n=3 p=2

        int m = a.length , n = a[0].length;
        int p = b.length , q = b[0].length;
        int[][] c = new int[m][q];

        if (n != p) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        for (int i = 0; i < m ; i++) { // row of A
            for (int j = 0; j < q; j++) {  // column of B
                int res = 0;
                for (int k = 0; k < n; k++) { // shared variable
                    res += a[i][k] * b[k][j];
                }
                c[i][j] = res;
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        //output
       // System.out.println(Arrays.deepToString(c));
    }
}
