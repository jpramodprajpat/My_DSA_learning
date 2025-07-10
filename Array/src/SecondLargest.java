public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10 ,  30 , 39 , 100 , 90 , 34 , 89 , 120};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
           if(arr[i] > max){
               sec_max = max;
               max = arr[i];
           }
           if(arr[i] > sec_max && arr[i] != max) sec_max = arr[i];
        }
        System.out.println("maximum : " + max);
        System.out.println("second largest : " + sec_max);
    }
}
