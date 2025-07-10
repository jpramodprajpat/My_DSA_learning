public class passingArrayToMethod {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void change(int[] pavan){
        pavan[0] = 10;
    }
    public static void main(String[] args) {
        int[] arr = { 12 , 23 , 34 , 45 };
        print(arr);
        change(arr);
        print(arr);
    }
}
