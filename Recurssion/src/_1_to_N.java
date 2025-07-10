public class _1_to_N
{
    public  static void printNum(int n ){
        if(n==0) return;
        printNum(n-1);
        System.out.print(n +" ");
    }
    public  static void printRevNum(int n ){
        if(n==0) return;
        System.out.print(n +" ");
        printRevNum(n-1);
    }
    public static void main(String[] args) {
        printNum(10);
        System.out.println();
        printRevNum(10);
    }
}
