public class Matrix_Rotate
{
    // Rotate 90 degree -> transpose then reverse each row
    public static void main(String[] args)
    {
        int[][] a = {{1,2,3} , {4,5,6} , {7,8,9}};
        int rows = a.length , cols = a[0].length;

        int[][] transpose = new int[cols][rows];

        // transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        // reverse each row
        for (int i = 0; i < cols; i++) {
                reverseRow(transpose[i],0,rows-1);
        }
        // print rotated matrix
        for(int[] arr : transpose){
            for( int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void reverseRow(int[] arr , int lo , int hi){
        while(lo<hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++; hi--;
        }
    }
}
