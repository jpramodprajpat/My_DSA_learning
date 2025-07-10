/* count the number of elements in given array greater than a given number x.*/
public class Q1 {
    public static void main(String[] args) {
        int[] data = {10 , 20 , 40 , 30 , 45 , 90};
        int n = data.length;

        int x = 32;
        int count = 0 ;

        for (int i = 0; i <n ; i++) {
            if(data[i] > x) count++;
        }
        System.out.println(count);
    }
}
