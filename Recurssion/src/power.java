public class power {
    public static int powerOf(int a, int b)
    {
        if(b==0) return 1;
        int ans = powerOf(a,b/2); // this will calculate a^b/2
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
    public static void main(String[] args) {
        System.out.println(powerOf(6,3));
        System.out.println(powerOf(6,0));
        System.out.println(powerOf(6,1));
        System.out.println(powerOf(2,8));
    }
}
