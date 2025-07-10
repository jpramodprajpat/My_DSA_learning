package String_Builders;
import java.util.Scanner;
public class Reverse_Each_Word {
    // store in the same Stringbuilder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i = 0  ,j = 0;
//        while(j<=n){
//              if(sb.charAt(j) == ' '){
//                reverse(sb,i,j-1);
//                i= j+1; j++;
//            }else j++;
//            if(j==n) {
//                reverse(sb,i,j-1);
//                break;
//            }
//        }
        while (j <= n) {
            if (j == n || sb.charAt(j) == ' ') {
                reverse(sb, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb , int i  ,int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
}
