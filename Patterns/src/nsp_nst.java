public class nsp_nst {
    public static void main(String[] args) {
        int n = 5;

        // complete triangle , left inverse triangle , left triangle  , rhombus
        int nsp = n-1 , nst = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }
}
