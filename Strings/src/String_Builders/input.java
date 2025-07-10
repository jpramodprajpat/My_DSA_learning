package String_Builders;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');
        System.out.println(sb);
    }
}
