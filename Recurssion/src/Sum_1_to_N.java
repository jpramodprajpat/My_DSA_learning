public class Sum_1_to_N {
    public static int sum(int n ){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(2));
        System.out.println(sum(3));
        System.out.println(sum(100));
        System.out.println(sum(10));
    }
}
