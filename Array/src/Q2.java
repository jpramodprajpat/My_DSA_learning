/* find the doublet in the array whose sum is equal to the given value x( Two Sum ) */
public class Q2 {
    // Hint : Use the Nested Loop
    public static void main(String[] args) {
        int[] arr = { 12 , 23 , 34 , 45 , 56};
        int n = arr.length;

        int tsum = 79;
        boolean flag = false ;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if(arr[i] + arr[j] == tsum){
                    flag = true;
                    System.out.println(i +" " + j);
                }
            }
        }
        if(flag == false) System.out.println("doublet not found");
    }
}
