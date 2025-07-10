public class SearchIn_Sorted_Matrix
{
    public boolean searchMatrix(int[][] arr, int target)
    {
        int m = arr.length , n = arr[0].length;
        int i = 0 , j = n-1;
        while(i<m && j>=0){
            if(arr[i][j] == target) return true;
            else if(arr[i][j] > target) j--; //move left
            else i++; // move down
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
