import java.util.Arrays;

public class Matrix_Addition {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {1,2,3} , {1,1,1}};
        int[][] b = {{1,2,3} , {1,2,3} , {1,1,1}};
        int m  = a.length;
        int n = a[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
