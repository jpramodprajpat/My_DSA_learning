public class basic {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //calculate the sum
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
