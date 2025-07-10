import java.util.Arrays;
public class SetMatrix_Zero
{
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setZeroes(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;

        // 1️⃣ Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // 2️⃣ Mark rows and cols using first row and first col
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 3️⃣ Apply row markers
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 4️⃣ Apply column markers
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 5️⃣ Handle first row if needed
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 0, 6},
                    {7, 8, 9}
            };

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            setZeroes(matrix);

            System.out.println("\nMatrix After Applying setZeroes:");
            printMatrix(matrix);
        }

    }


