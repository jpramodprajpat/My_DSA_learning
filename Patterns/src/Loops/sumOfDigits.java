package Loops;

public class sumOfDigits {
    // Normal function
    public static void sumOfDig(int num){
        int sum = 0 ;
        while(num  > 0){
            int digit = num%10; // get the last digit
            sum += digit; // add to sum
            num = num/10; // remove the last digit
        }
        System.out.println(sum);
    }
    // reversive function
    public static int recSum(int num){
        if(num==0) return 0;
        return num%10 + recSum(num/10);
    }

    public static void main(String[] args)
    {
        int num = 12345;
        sumOfDig(num);
    }
}
