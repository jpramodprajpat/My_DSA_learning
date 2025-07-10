package Loops;

public class ReverseOfNum {
    // Recursive function
    public static int reverse(int num , int rev){
        if(num == 0) return rev;
        rev = rev*10 + num%10;
        return reverse(num/10 , rev);
    }
    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(reverse(num,0));
      /*  int rev = 0 ;
        while(num != 0){
            rev*= 10; //multiplied by 10
            rev += num%10; //last digit added
            num/=10;
        }*/
    }
}
 /* while(num != 0){
            System.out.print(num%10);
            num/=10;
        }*/
