public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{12,10,19}, {31,20,11} ,{23,0,1}};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(max<arr[i][j]) max = arr[i][j];
                sum+=arr[i][j];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("sum : "+sum);
    }
}
