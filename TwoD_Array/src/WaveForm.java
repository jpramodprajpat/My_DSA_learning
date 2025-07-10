public class WaveForm {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {4,5,6} , {7,8,9}};
        int rows = a.length , cols = a[0].length;

        // row-wise
//        for (int i = 0; i < rows ; i++) {
//            if(i%2 != 0){ // odd
//                for (int j = cols-1; j >=0 ; j--) System.out.print(a[i][j] + " ");
//            }else{  //even
//                for (int j = 0; j < cols; j++) System.out.print(a[i][j] + " ");
//            }
//        }

        // col-wise
        for (int i = 0; i < cols ; i++) {
            if(i%2 != 0){ // odd
                for (int j = rows-1; j >=0 ; j--) System.out.print(a[j][i] + " ");
            }else{  //even
                for (int j = 0; j < rows; j++) System.out.print(a[j][i] + " ");
            }
        }
    }
}
