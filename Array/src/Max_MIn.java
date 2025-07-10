public class Max_MIn {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 ,50 , 100 , 0 , 12};
        int n = arr.length;

        // maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);

        // minimum
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
