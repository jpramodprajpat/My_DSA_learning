public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i <n ; i++) {
            int val = 1;
            // spaces
            for (int s = 1; s <=n-i ; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(val+"   ");
                val = val*(i-j)/(j+1); // combination logic
            }
            System.out.println();
        }
    }
}
