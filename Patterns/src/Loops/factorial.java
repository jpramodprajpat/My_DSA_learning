package Loops;

public class factorial {
    public static int fact(int num){
        if(num <=0) return 1;
        return num * fact(num-1);
    }
    public static void main(String[] args) {
        int num = 6;
        int fact = 1;
        for (int i = 2; i <=num ; i++) {
            fact*=i;
        }
        System.out.println("factorila is : "+fact);
        System.out.println("recursive Loops.factorial is : "+fact(6) );
    }
}
